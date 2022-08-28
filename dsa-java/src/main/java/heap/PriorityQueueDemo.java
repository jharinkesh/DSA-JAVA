package heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

    public static void main(String[] args) {
//	PriorityQueue<Integer> q = new PriorityQueue<Integer>();
	PriorityQueue<Integer> q = new PriorityQueue<Integer>(Collections.reverseOrder());

	q.add(45);
	q.add(39);
	q.add(60);
	q.add(99);

	System.out.println(q);
	System.out.println(q.peek());
	System.out.println(q.poll());
	System.out.println(q.peek());
    }
}
