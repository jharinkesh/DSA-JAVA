package graphs;

import java.util.Arrays;
import java.util.LinkedList;

public class WeightedAdjListDemo {
    public static void main(String[] args) {
	WeightedAdjList list = new WeightedAdjList(5);
	list.add(0, 2, 1);
	list.add(1, 3, 2);
	list.add(1, 1, 3);
	list.add(2, 1, 3);
	list.add(2, 2, 4);
	list.add(3, 5, 4);
	list.disp();
	list.dijkstra(0);
//	System.out.println(list.getMinVertex(new boolean[5], 2));

    }
}

class WeightedAdjList {
    final int SIZE;
    final LinkedList<Node>[] list;
    final int m = Integer.MAX_VALUE;

    WeightedAdjList(int size) {
	this.SIZE = size;
	list = new LinkedList[SIZE];
	for (int i = 0; i < SIZE; i++) {
	    list[i] = new LinkedList<Node>();
	}
    }

    void dijkstra(int source) {
	int[] dist = new int[SIZE];
	Arrays.fill(dist, m);
	boolean s[] = new boolean[SIZE];
	for (Node n : list[source]) {
	    dist[n.label] = n.cost;
	}

	dist[source] = 0;
	s[source] = true;
	for (int i = 0; i < SIZE; i++) {
	    int u = getMinVertex(s, dist);
	    if (u != -1) {
		s[u] = true;
		for (Node w : list[u]) {
		    if (!s[w.label]) {
			if (dist[u] + w.cost < dist[w.label]) {
			    dist[w.label] = dist[u] + w.cost;
			}
		    }
		}
	    }
	}

	System.out.println(Arrays.toString(dist));
    }

    public int getMinVertex(boolean[] s, int[] dist) {
	int minIndex = -1, minDist = Integer.MAX_VALUE;
	for (int i = 0; i < SIZE; i++) {
	    if (!s[i] && dist[i] < minDist) {
		minDist = dist[i];
		minIndex = i;
	    }
	}
	return minIndex;
    }

    void add(int source, int cost, int dest) {
	list[source].add(new Node(dest, cost));
    }

    void disp() {
	for (int i = 0; i < SIZE; i++) {
	    System.out.println(i + ": " + list[i].toString());
	}
    }

}

class Node {
    int label;
    int cost;

    public Node(int label, int cost) {
	super();
	this.label = label;
	this.cost = cost;
    }

    @Override
    public String toString() {
	return "  --" + cost + "--> {" + label + "} ";
    }

}
