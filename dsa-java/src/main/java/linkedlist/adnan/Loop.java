package main.java.linkedlist.adnan;

import linkedlist.SNode;

public class Loop {

    static boolean detect(SNode head) {
	SNode n1 = head, n2 = head;
	while (n1 != null && n2 != null && n1.next != null) {
	    n1 = n1.next;
	    n2 = n2.next.next;
	    if (n1 == n2)
		return true;
	}

	return false;
    }

}
