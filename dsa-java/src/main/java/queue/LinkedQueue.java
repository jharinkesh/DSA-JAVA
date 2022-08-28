package queue;

class LinkedQueue {

    SNode front;
    int size;

    public static void main(String... args) {

	LinkedQueue q = new LinkedQueue();
	q.enque(30);
	q.enque(67);
	q.enque(87);
	q.disp();
	q.deque();
	q.deque();
	q.deque();
	q.disp();

    }

    void enque(int x) {
	if (size == 0) {
	    front = new SNode(x);
	} else {
	    SNode n1 = front;
	    while (n1.next != null) {
		n1 = n1.next;
	    }
	    n1.next = new SNode(x);
	}
	size++;
    }

    int deque() {
	if (size == 0)
	    return -1;
	SNode x = front;
	front = front.next;
	size--;
	return x.data;
    }

    void disp() {
	System.out.print("\n===>");
	SNode x = front;
	while (x != null) {
	    System.out.print(" " + x.data);
	    x = x.next;
	}
    }

}

class SNode {
    int data;
    SNode next;

    SNode(int data) {
	this.data = data;
    }
}