package main.java.linkedlist.adnan;

import linkedlist.SNode;

public class AddLIstIntegers {

    public static SNode add(SNode n1, SNode n2) {
	SNode res = new SNode(0);
	SNode head = res;
	int carry = 0;
	while (n1 != null || n2 != null) {
	    int a = (n1 != null) ? n1.data : 0;
	    int b = (n2 != null) ? n2.data : 0;
	    int r = a + b + carry;
	    res.next = new SNode(r % 10);
	    res = res.next;
	    carry = r / 10;
	    n1 = (n1 != null) ? n1.next : null;
	    n2 = (n2 != null) ? n2.next : null;
	}

	if (carry > 0) {
	    res.next = new SNode(carry);
	    res = res.next;
	}

	return head.next;
    }

}
