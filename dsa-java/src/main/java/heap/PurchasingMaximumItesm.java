package heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class PurchasingMaximumItesm {

    public static void main(String[] args) {
	int[] a = { 1, 12, 5, 111, 200 };
	PriorityQueue<Integer> q = new PriorityQueue<Integer>();
	Arrays.stream(a).forEach(x -> q.add(x));
	System.out.println(q);

	int sum = 10;
	int res = 0;

	while (q.peek() <= sum) {
	    sum = sum - q.poll();
	    res++;
	}

	System.out.println("max items: " + res);

    }
}
