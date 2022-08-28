package game.theory;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Othello {

    public static void main(String[] args) {
	Board b = new Board(8);
	b.init();
	b.disp();
//	System.out.println(b.isValid(b.BLACK, 2, 3));
//	System.out.println(b.isValid(b.BLACK, 3, 2));
//	System.out.println(b.isValid(b.BLACK, 4, 5));
//	System.err.println(b.isValid(b.BLACK, 5, 4));
//	System.out.println(b.isValid(b.BLACK, 5, 2));

	// List<Point> points = b.getPossibleMoves(b.BLACK);
	// b.dispMoves(points);
	// System.out.println(points);
	// b.makeMove(b.BLACK);
	// System.out.println(points.stream().max((x, y) -> x.cost - y.cost));
	b.makeMove(b.WHITE);
	System.out.println("++++++++++ FINAL BOARD ++++++++++");
	b.disp();
	System.out.println("\n WINNER is: " + b.evalauate());
	System.out.println("Number of moves: " + b.count);
    }
}

class Board {
    int[][] m;
    final int SIZE;
    final int EMPTY = 0, WHITE = 1, BLACK = 2;
    final int[] XDIR = { -1, -1, 0, 1, 1, 1, 0, -1 };
    final int[] YDIR = { 0, 1, 1, 1, 0, -1, -1, -1 };

    Board(int size) {
	this.SIZE = size;
	m = new int[SIZE][SIZE];
    }

    void init() {
	m[3][3] = WHITE;
	m[3][4] = BLACK;
	m[4][3] = BLACK;
	m[4][4] = WHITE;
	m[2][4] = BLACK;
	m[3][2] = WHITE;
    }

    int count = 0;

    void makeMove(int color) {
	this.count++;
	List<Point> points = getPossibleMoves(color);
	Optional<Point> result = points.stream().max((x, y) -> x.cost - y.cost);
	if (result.isPresent()) {
	    Point max = result.get();
	    System.out.println("\n chance: " + color + " ");
	    disp();
	    System.err.println("\nmax point: " + max);
	    move(color, max.x, max.y, max.dir);
	    makeMove(invert(color));
	} else {
	    if (!getPossibleMoves(color).isEmpty()) {
		makeMove(invert(color));
	    }
	}

    }

    int evalauate() {
	int c1 = 0, c2 = 0;
	for (int i = 0; i < XDIR.length; i++) {
	    for (int j = 0; j < XDIR.length; j++) {
		if (m[i][j] == 1)
		    c1++;
		else if (m[i][j] == 2)
		    c2++;
	    }
	}

	if (c1 > c2)
	    return 1;

	return (c1 == c2) ? 0 : 2;
    }

    int invert(int color) {
	return (color == WHITE) ? BLACK : WHITE;
    }

    void move(int color, int x, int y, List<Integer> dir) {
	for (int i = 0; i < XDIR.length; i++) {
	    if (!dir.contains(i)) {
		continue;
	    }
	    int cX = x + XDIR[i], cY = y + YDIR[i];
	    while (cX >= 0 && cX < SIZE && cY >= 0 && cY < SIZE) {
		if (m[cX][cY] == color)
		    break;
		m[cX][cY] = invert(m[cX][cY]);
		cX = cX + XDIR[i];
		cY = cY + YDIR[i];
	    }

	}

	m[x][y] = color;
    }

    List<Point> getPossibleMoves(int color) {
	List<Point> moves = new ArrayList<Point>();
	for (int i = 0; i < SIZE; i++) {
	    for (int j = 0; j < SIZE; j++) {
		if (m[i][j] == 0) {
		    List<Integer> list = new ArrayList<>();
		    int cost = isValidCost(color, i, j, list);
		    if (cost != 0) {
			moves.add(new Point(i, j, cost, list));
		    }
		}
	    }
	}
	return moves;
    }

    int isValidCost(int color, int x, int y, List<Integer> list) {
	int count = 0;
	for (int i = 0; i < XDIR.length; i++) {
	    int cX = x + XDIR[i], cY = y + YDIR[i];
	    int dcount = 0, lcolor = 0;
	    while (cX >= 0 && cX < SIZE && cY >= 0 && cY < SIZE) {
		lcolor = m[cX][cY];
		if (m[cX][cY] == color)
		    break;

		if (m[cX][cY] == 0 || m[cX][cY] == color) {
		    dcount = 0;
		    break;
		}
		dcount++;
		cX = cX + XDIR[i];
		cY = cY + YDIR[i];
	    }

	    if (dcount > 0 && lcolor == color) {
		list.add(i);
		count = count + dcount;
	    }

	}
	return count;
    }

    ////////////////////////////////////////////////

    void dispMoves(List<Point> points) {
	log("  ");
	for (int h = 0; h < SIZE; h++)
	    log(" " + h);
	logL("\n-----------------------");

	for (int i = 0; i < SIZE; i++) {
	    log(i + ":");
	    for (int j = 0; j < SIZE; j++) {
		if (points.contains(new Point(i, j, 0, null))) {
		    logR(" " + m[i][j]);
		} else
		    log(" " + m[i][j]);
	    }
	    logL("");
	}
    }

    void disp() {
	log("  ");
	for (int h = 0; h < SIZE; h++)
	    log(" " + h);
	logL("\n-----------------------");

	for (int i = 0; i < SIZE; i++) {
	    log(i + ":");
	    for (int j = 0; j < SIZE; j++) {
		log(" " + m[i][j]);
	    }
	    logL("");
	}
    }

    void logL(Object s) {
	System.out.println(s);
    }

    void log(Object s) {
	System.out.print(s);
    }

    void logR(Object s) {
	System.err.print(s);
    }

}

class Point {
    int x;
    int y;
    int cost;
    List<Integer> dir;

    Point(int x, int y, int cost, List<Integer> dir) {
	this.x = x;
	this.y = y;
	this.cost = cost;
	this.dir = dir;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result;
	result = prime * result + x;
	result = prime * result + y;
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	Point other = (Point) obj;
	if (x != other.x)
	    return false;
	if (y != other.y)
	    return false;
	return true;
    }

    @Override
    public String toString() {
	return "Point [x=" + x + ", y=" + y + ", cost=" + cost + "]";
    }

}
