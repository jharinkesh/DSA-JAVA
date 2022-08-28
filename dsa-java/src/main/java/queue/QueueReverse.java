package queue;

import java.util.*;

public class QueueReverse {

	
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		q.add(30);
		q.add(40);
		q.add(50);
		q.add(60);
		
		System.out.println(q);
		reverseR(q);
		System.out.println(q);
	}
	
	static void reverse(Queue<Integer> q) {
		Stack<Integer> s = new Stack<Integer>();
		while(!q.isEmpty())
			s.push(q.poll());
		while(!s.isEmpty())
			q.add(s.pop());
	}
	
	static void reverseR(Queue<Integer> q) {
		if(q.isEmpty())
			return;
		int x = q.poll();
		reverseR(q);
		q.add(x);
	}
	
	
}
