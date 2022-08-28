package main.java.linkedlist.adnan;

import linkedlist.SNode;

public class PalindromCheck {

    public static boolean check(SNode head) {
	SNode slow = head, fast = head;
	while (fast != null && fast.next != null) {
	    slow = slow.next;
	    fast = fast.next.next;
	}

	SNode first = head;
	SNode second = Reverse.reverse(slow);

	while (first != null && second != null) {
	    if (first.data != second.data)
		return false;
	    first = first.next;
	    second = second.next;
	}

	return true;
    }
}
