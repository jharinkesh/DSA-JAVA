package main.java.linkedlist.adnan;

import linkedlist.SNode;

public class CyclicRightShift {

    // incomplete
    public static SNode rightShift(SNode head, int k) {
	SNode n1 = head;
	while (n1.next != null) {
	    n1 = n1.next;
	}

	n1.next = head;
	for (int i = 0; i < k; i++) {
	    n1 = n1.next;
	}
	head = n1.next;

	n1.next = null;
	return head;
    }
}
