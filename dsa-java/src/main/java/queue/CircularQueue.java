package queue;

import java.util.Scanner;

public class CircularQueue {

    public static void main(String[] args) {
	CQ q = new CQ(5);
	Scanner sc = new Scanner(System.in);
	while (true) {
	    System.out.println("\nEnter the operation 1.Enque 2. Deque ");
	    int option = sc.nextInt();
	    if (option == 1) {
		System.out.println("\nEnter the number: ");
		q.enque(sc.nextInt());
	    } else if (option == 2) {
		q.deque();
	    } else {
		break;
	    }
	    q.disp();
	}
	sc.close();

    }
}

class CQ {

    int[] a;
    int size;
    int cap, front = -1;

    CQ(int cap) {
	this.cap = cap;
	a = new int[this.cap];
    }

    void enque(int x) {
		if (size >= cap)
			return;

		if (size == 0) {
			front = 0;
			a[front] = x;
		} else {
			int rear = (front + size) % cap;
			a[rear] = x;
		}

		size++;
    }

    void deque() {
		if (size == 0)
			return;
		front = (front + 1) % cap;
		size--;
    }

    void disp() {
	System.out.print("\n ==> ");
	for (int i = front; i < (front + size) % cap; i++)
	    if (i == front)
		System.err.print(" " + a[i]);
	    else
		System.out.print(" " + a[i]);
	System.out.println();
    }

}