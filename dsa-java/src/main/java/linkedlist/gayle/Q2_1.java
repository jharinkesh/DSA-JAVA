package main.java.linkedlist.gayle;

/**
 * Write code to remove duplicates from an unsorted linked list. FOLLOW UP How
 * would you solve this problem if a temporary buffer is not allowed?
 */
public class Q2_1 {

    public static void main(String[] args) {
	SList list = new SList();
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(20);
	list.add(30);
	list.add(40);
	list.add(40);
	list.disp();
	removeDuplicates(list.head);
	list.disp();
    }

    static void removeDuplicates(SNode head) {
	SNode n1 = head;
	while (n1 != null) {
	    SNode n2 = n1;
	    while (n2.next != null) {
		if (n1.data == n2.next.data) {
		    n2.next = n2.next.next;
		} else {
		    n2 = n2.next;
		}
	    }
	    n1 = n1.next;
	}
    }

}
