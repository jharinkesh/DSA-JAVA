package linkedlist;

public class SLink {

    Node head;

    public static void main(String[] args) {

	SLink l = new SLink();
	// l.add(20).add(30).add(40).add(50).add(60);
	// l.disp();
	// l.reverse();
	// l.disp();
	l.makeCycle();
	System.out.println(l.hasCycle());

    }

    boolean hasCycle() {
	Node s = head, f = head;
	while (s != null && f != null && f.next != null) {
	    s = s.next;
	    f = f.next.next;
	    if (s == f)
		return true;
	}
	return false;
    }

    void makeCycle() {
	head = new Node(10);
	Node n1 = new Node(20);
	Node n2 = new Node(30);
	Node n3 = new Node(40);

	head.next = n1;
	n1.next = n2;
	n2.next = n3;
	n3.next = n1;
    }

    void reverse() {
	Node n1 = head, prev = null;
	while (n1 != null) {
	    Node t = n1.next;
	    n1.next = prev;
	    prev = n1;
	    n1 = t;
	}
	this.head = prev;
    }

    SLink add(int data) {
	if (head == null)
	    head = new Node(data);
	else {
	    Node n1 = head;
	    while (n1.next != null) {
		n1 = n1.next;
	    }

	    n1.next = new Node(data);
	}
	return this;
    }

    void disp() {
	System.out.println();
	Node n1 = head;
	while (n1 != null) {
	    System.out.print(" " + n1.data);
	    n1 = n1.next;
	}
    }

}

class Node {
    int data;
    Node next;

    Node(int data) {
	this.data = data;
    }
}
