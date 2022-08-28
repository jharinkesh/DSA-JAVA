package main.java.linkedlist.adnan;

import linkedlist.SNode;

public class Reverse {

    static SNode reverse(SNode head) {
	SNode n1 = head, prev = null;
	while (n1 != null) {
	    SNode t = n1.next;
	    n1.next = prev;
	    prev = n1;
	    n1 = t;
	}
	return prev;
    }
}
