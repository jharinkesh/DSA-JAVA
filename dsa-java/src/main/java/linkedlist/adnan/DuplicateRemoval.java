package main.java.linkedlist.adnan;

import linkedlist.SNode;

public class DuplicateRemoval {

    public static void removeDup(SNode head) {
	SNode prev = head, current = prev.next;
	while (current != null) {
	    if (current.data == prev.data) {
		prev.next = current.next;
	    } else {
		prev = current;
	    }
	    current = current.next;
	}
    }
}
