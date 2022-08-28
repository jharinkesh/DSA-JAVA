package main.java.linkedlist.adnan;

import linkedlist.SLink;
import linkedlist.SNode;

//1. sorted list
public class MergeTwoList {
    public static void main(String[] args) {
	SNode head = new SNode(23);
	SLink.add(head, 24);
	SLink.add(head, 25);
	SLink.add(head, 26);
	SLink.disp(head);
    }

    static SNode merge(SNode l1, SNode l2) {
	SNode temp = new SNode(0);
	SNode n1 = l1, n2 = l2, head = temp;
	while (n1 != null && n2 != null) {
	    if (n1.data > n2.data) {
		temp.next = n1;
		n1 = n1.next;
	    } else {
		temp.next = n2;
		n2 = n2.next;
	    }
	    temp = temp.next;
	}

	temp.next = (n1 == null) ? n2 : n1;
	return head.next;
    }

}
