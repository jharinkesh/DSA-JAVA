package main.java.linkedlist.gayle;

/**
 * Implement an algorithm to delete a node in the middle of a single linked
 * list, given only access to that node.
 */
public class Q2_3 {

    public static void main(String[] args) {
	SList list = new SList();
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(40);
	list.disp();
	removeInMiddle(list, 30);
	list.disp();
    }

    static void removeInMiddle(SList list, int data) {
	SNode n1 = list.head;
	if (n1.data == data) {
	    list.head = n1.next;
	    return;
	}

	while (n1.next != null) {
	    if (n1.next.data == data) {
		n1.next = n1.next.next;
	    }
	    n1 = n1.next;
	}
    }
}
