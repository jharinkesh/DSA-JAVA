package main.java.linkedlist.gayle;

public class SList {
    SNode head = null;

    public static void main(String[] args) {
	SList list = new SList();
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(40);

	// list.disp();

	// list.insertAfter(20, 21);
	// list.reverse();
	// list.detectCycle();
	// list.remove(10);
	list.disp();
    }

    void remove(int data) {
	SNode n1 = head;
	if (n1.data == data) {
	    head = n1.next;
	    return;
	}
	while (n1.next != null) {
	    if (n1.next.data == data) {
		n1.next = n1.next.next;
	    }
	    n1 = n1.next;
	}
    }

    static void detectCycle(SNode head) {
	SNode n1 = head, n2 = head;
	while (n1 != null && n2 != null && n2.next != null) {
	    n1 = n1.next;
	    n2 = n2.next.next;
	    if (n1 == n2) {
		System.out.println("cycle found");
		return;
	    }
	}
	System.out.println("no cycle found");
    }

    void reverse() {
	SNode n1 = null, n2 = head;
	while (n2 != null) {
	    SNode right = n2.next;
	    n2.next = n1;
	    n1 = n2;
	    n2 = right;
	}
	head = n1;
    }

    void insertAfter(int element, int data) {
	SNode n1 = head;
	while (n1 != null) {
	    if (n1.data == element) {
		break;
	    }
	    n1 = n1.next;
	}
	n1.next = new SNode(data, n1.next);
    }

    SNode add(int data) {
	if (head == null) {
	    return head = new SNode(data);
	} else {
	    SNode n1 = head;
	    while (n1.next != null) {
		n1 = n1.next;
	    }
	    return n1.next = new SNode(data);
	}
    }

    static void disp(SNode head) {
	System.out.println("\nELEMENTS ARE : ");
	SNode n1 = head;
	while (n1 != null) {
	    System.out.print(n1.data + " -> ");
	    n1 = n1.next;
	}
    }

    void disp() {
	disp(this.head);
    }
}
