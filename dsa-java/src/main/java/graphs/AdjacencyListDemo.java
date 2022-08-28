package graphs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class AdjacencyListDemo {

    public static void main(String[] args) {
	AdjacencyList ls = new AdjacencyList(7);

	ls.add(0, 1);
//    ls.add(0, 2);
//    ls.add(1, 2);
//    ls.add(2, 3);
//    ls.disp();
//
//    ls.remove(2, 3);
//    ls.disp();

//	ls.add(0, 1);
//	ls.add(0, 2);
//	ls.add(0, 4);
//	ls.add(3, 4);
//
//	ls.disp();
//	ls.bfs(0);

//	ls.add(0, 1);
//	ls.add(0, 3);
//	ls.add(0, 5);
//
//	ls.add(1, 2);
//	ls.add(3, 4);
//	ls.add(5, 6);
//	ls.dfs(0);
//	ls.bfs(0);
//	ls.dfsR(0);

//	ls.add(0, 1);
//	ls.add(1, 2);
//	ls.add(1, 3);
//	ls.add(2, 3);
	ls.add(0, 1);
	ls.add(0, 3);
	ls.add(1, 3);
	ls.add(1, 4);
	ls.add(2, 0);
	ls.add(2, 5);
	ls.add(3, 5);
	ls.add(3, 6);
	ls.add(4, 6);
	ls.add(6, 5);
	ls.shortestPath(0);

    }
}

class AdjacencyList {
    final int n;
    final LinkedList<Integer>[] list;
    boolean[] visited;

    AdjacencyList(int n) {
	this.n = n;
	list = new LinkedList[n];
	visited = new boolean[n];
	for (int i = 0; i < list.length; i++) {
	    list[i] = new LinkedList<Integer>();
	}
    }

    public void add(int u, int v) {
	list[u].add(v);
	// list[v].add(u);
    }

    public void remove(Integer u, Integer v) {
	list[u].remove(v);
	list[v].remove(u);
    }

    public void disp() {
	for (int i = 0; i < n; i++) {
	    System.out.println(i + " : " + list[i]);
	}
    }

    public void shortestPath(int source) {
	int dist[] = new int[n];
	int path[] = new int[n];
	for (int i = 0; i < n; i++)
	    dist[i] = -1;
	dist[source] = 0;
	LinkedList<Integer> q = new LinkedList<Integer>();
	q.add(source);
	while (!q.isEmpty()) {
	    int v = q.poll();
	    for (int w : list[v]) {
		if (dist[w] == -1) {
		    dist[w] = dist[v] + 1;
		    path[w] = v;
		    q.add(w);
		}
	    }
	}

	System.out.println("Path: " + Arrays.toString(path));
	System.out.println("Dist: " + Arrays.toString(dist));
    }

    public void dfsR(int startNode) {
	visited[startNode] = true;
	System.out.println(startNode);
	for (int i : list[startNode]) {
	    if (!visited[i])
		dfsR(i);
	}
    }

    public void dfs(int startNode) {
	Stack<Integer> s = new Stack<Integer>();
	boolean[] visited = new boolean[n];
	s.push(startNode);
	visited[startNode] = true;
	System.out.println(startNode);
	while (!s.isEmpty()) {
	    int v = s.peek();
	    int w = getUnvisited(v, visited);
	    if (w != -1) {
		visited[w] = true;
		s.push(w);
		System.out.println(w);
	    } else {
		s.pop();
	    }
	}
    }

    int getUnvisited(int node, boolean[] visited) {
	for (int i : list[node]) {
	    if (!visited[i])
		return i;
	}
	return -1;
    }

    public void bfs(int startNode) {
	boolean visited[] = new boolean[n];
	Queue<Integer> q = new LinkedList<Integer>();
	q.add(startNode);
	visited[startNode] = true;
	while (!q.isEmpty()) {
	    int v = q.poll();
	    System.out.println(v);
	    for (int u : list[v]) {
		if (!visited[u]) {
		    q.add(u);
		    visited[u] = true;
		}
	    }
	}
    }

}
