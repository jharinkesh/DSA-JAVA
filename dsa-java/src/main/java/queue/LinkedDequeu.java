package queue;

public class LinkedDequeu {
    Node front, rear;
    int size;

    public static void main(String[] args) {
	LinkedDequeu q = new LinkedDequeu();
	q.inserFront(23);
	q.disp();
	q.inserFront(40);
	q.inserFront(60);
	q.disp();

	q.inserRear(99);
	q.inserRear(100);
	q.disp();

	q.removeFront();
	q.disp();
	q.removeRear();
	q.disp();
	q.removeRear();
	q.removeRear();
	q.disp();
	q.removeRear();
	q.disp();

    }

    void removeFront() {
	if (size > 0) {
	    front = front.right;
	    size--;
	    if (size == 0)
		rear = null;
	}
    }

    void removeRear() {
	if (size > 0) {
	    rear = rear.left;
	    size--;
	    if (size == 0)
		front = null;
	}
    }

    void inserFront(int x) {
	if (size == 0)
	    front = rear = new Node(x);
	else {
	    Node n1 = new Node(x);
	    front.left = n1;
	    n1.right = front;
	    front = n1;
	}

	size++;
    }

    void inserRear(int x) {
	if (size == 0)
	    front = rear = new Node(x);
	else {
	    Node n1 = new Node(x);
	    rear.right = n1;
	    n1.left = rear;
	    rear = n1;
	}
	size++;
    }

    void disp() {
	if (size > 0) {
	    Node n1 = front;
	    System.out.print("\n --> ");
	    while (n1 != rear) {
		System.out.print(" " + n1.data);
		n1 = n1.right;
	    }
	    System.out.print(" " + n1.data);
	}
    }

}

class Node {
    int data;
    Node left, right;

    Node(int data) {
	this.data = data;
    }

}