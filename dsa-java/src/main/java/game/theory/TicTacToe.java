package game.theory;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
	Game game = new Game(3);
	game.disp();
//	game.play(1, 2, 'O');
//	game.disp();
	Scanner sc = new Scanner(System.in);
	char player = 'O';
	while (!game.isOver()) {
	    System.out.print("Turn for: [" + player + "],  Enter the x,y: ");
	    int x = sc.nextInt();
	    int y = sc.nextInt();
	    game.play(x, y, player);
	    game.disp();
	    player = (player == 'O') ? 'X' : 'O';
	}
	sc.close();
    }
}

class Game {
    Character[][] board;
    final int SIZE;
    final char EMPTY = ' ';

    Game(int size) {
	SIZE = size;
	board = new Character[SIZE][SIZE];
	for (int i = 0; i < board.length; i++) {
	    Arrays.fill(board[i], EMPTY);
	}
    }

    void play(int i, int j, char player) {
	if (board[i][j] == EMPTY && i >= 0 && i < SIZE && j >= 0 && j < SIZE) {
	    board[i][j] = player;
	}
    }

    boolean isOver() {

	// checking rowwise
	for (int row = 0; row < SIZE; row++) {
	    char val = board[row][0];
	    if (val == EMPTY)
		continue;
	    boolean isEqual = false;
	    for (int col = 1; col < SIZE; col++) {
		isEqual = (board[row][col] == val);
	    }
	    if (isEqual) {
		System.out.println("Winner is: " + val);
		return true;
	    }
	}
	// checking col wise
	for (int col = 0; col < SIZE; col++) {
	    char val = board[0][col];
	    if (val == EMPTY)
		continue;
	    boolean isEqual = false;
	    for (int row = 1; row < SIZE; row++) {
		isEqual = (board[row][col] == val);
	    }
	    if (isEqual) {
		System.out.println("Winner is: " + val);
		return true;
	    }
	}

	char val = board[0][0];
	boolean isEqual = false;

	if (val != EMPTY) {
	    for (int i = 1; i < SIZE; i++) {
		isEqual = (board[i][i] == val);
	    }
	}

	if (isEqual) {
	    System.out.println("Winner is: " + val);
	    return true;
	}

	val = board[0][SIZE - 1];
	if (val != EMPTY) {
	    for (int i = 1; i < SIZE; i++) {
		int col = SIZE - 1 - i;
		isEqual = (board[i][col] == val);
	    }
	}

	if (isEqual) {
	    System.out.println("Winner is: " + val);
	    return true;
	}

	return false;
    }

    void disp() {
	System.out.println();
	for (int i = 0; i < SIZE; i++) {
	    for (int j = 0; j < SIZE; j++) {
		if (j < SIZE - 1)
		    System.out.print(board[i][j] + "|");
		else
		    System.out.print(board[i][j]);
	    }
	    System.out.println("");
	}
    }

}