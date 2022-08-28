package queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class DequeJavaDemo {

    // Deque as a stack
    public static void main(String[] args) {
	ArrayDeque<Integer> d = new ArrayDeque<>();
	d.add(30);
	d.add(10);
	d.add(80);
	d.add(100);
	System.out.println(d);
	System.out.println(d.remove());
	System.out.println(d.remove());
	System.out.println(d.remove());
	System.out.println(d.remove());
	System.out.println(d.remove());
    }

    // Deque as a stack
    public static void main7(String[] args) {
	ArrayDeque<Integer> d = new ArrayDeque<>();
	d.offer(30);
	d.offer(10);
	d.offer(80);
	d.offer(100);
	System.out.println(d);
	System.out.println(d.poll());
	System.out.println(d.poll());
	System.out.println(d.poll());
	System.out.println(d.poll());
	System.out.println(d.poll());
    }

    // Deque as a stack
    public static void main6(String[] args) {
	ArrayDeque<Integer> d = new ArrayDeque<>();
	d.push(30);
	d.push(10);
	d.push(80);
	d.push(100);
	System.out.println(d);
	System.out.println(d.pop());
    }

    public static void main5(String[] args) {
	ArrayDeque<Integer> d = new ArrayDeque<>();
	d.addFirst(30);
	d.addFirst(50);
	d.addFirst(70);
	d.add(10);
	System.out.println(d);
    }

    public static void main4(String[] args) {
	Deque<Integer> d = new LinkedList<>();
	d.addFirst(20);
	d.addFirst(60);
	d.addLast(80);
	d.addLast(90);
	// 60 20 80 90
//	Iterator<Integer> it = d.iterator();
//	while (it.hasNext()) {
//	    System.out.println(it.next());
//	}

	Iterator<Integer> it = d.descendingIterator();
	while (it.hasNext()) {
	    System.out.println(it.next());
	}

    }

    public static void main3(String[] args) {
	Deque<Integer> d = new LinkedList<>();
	d.addFirst(20);
	d.addFirst(60);
	d.addLast(80);
	d.addLast(90);
	// 60 20 80 90
	System.out.println(d.getFirst());
	System.out.println(d.getLast());

	System.out.println(d.removeFirst());
	System.out.println(d.removeLast());

	System.out.println(d.getFirst());
	System.out.println(d.getLast());

	System.out.println("\n---- \n" + d.removeFirst());

	System.out.println(d.removeFirst());

	System.out.println(d.removeFirst());

    }

    public static void main2(String[] args) {
	Deque<Integer> d = new LinkedList<>();
	d.offerFirst(20);
	d.offerFirst(60);
	d.offerLast(80);
	d.offerLast(90);
	// 60 20 80 90
	System.out.println(d.peekFirst());
	System.out.println(d.peekLast());

	System.out.println(d.pollFirst());
	System.out.println(d.pollLast());

	System.out.println(d.peekFirst());
	System.out.println(d.peekLast());

	System.out.println("\n---- \n" + d.pollFirst());

	System.out.println(d.pollFirst());

	System.out.println(d.pollFirst());

    }

}
