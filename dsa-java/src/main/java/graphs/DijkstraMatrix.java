package graphs;

import java.util.Arrays;

public class DijkstraMatrix {
    static int m = Integer.MAX_VALUE;

    public static void main(String[] args) {
	int[][] cost = { { 0, 1, m, 5 }, { 1, 0, 2, m }, { m, 2, 0, 1 }, { 5, m, 1, 0 } };
	dijkstra(cost, cost.length, 0);
    }

    static void dijkstra(int[][] cost, int n, int source) {
	int[] dist = new int[n];
	boolean s[] = new boolean[n];
	for (int i = 0; i < n; i++) {
	    s[i] = false;
	    dist[i] = cost[source][i];
	}

	dist[source] = 0;
	s[source] = true;

	for (int i = 0; i < n; i++) {
	    int u = getMinVertex(s, dist);
	    if (u != -1) {
		s[u] = true;
		for (int w = 0; w < n; w++) {
		    if (cost[u][w] != m && s[w] == false) {
			if (dist[u] + cost[u][w] < dist[w]) {
			    dist[w] = dist[u] + cost[u][w];
			}
		    }
		}
	    }
	}

	System.out.println(Arrays.toString(dist));

    }

    static int getMinVertex(boolean[] s, int[] dist) {
	int minIndex = -1, minDist = Integer.MAX_VALUE;
	for (int i = 0; i < s.length; i++) {
	    if (!s[i] && dist[i] < minDist) {
		minDist = dist[i];
		minIndex = i;
	    }
	}
	return minIndex;
    }

}
