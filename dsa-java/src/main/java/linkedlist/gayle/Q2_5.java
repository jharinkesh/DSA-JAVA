package main.java.linkedlist.gayle;

/**
 * Given a circular linked list, implement an algorithm which returns node at
 * the beginning of the loop. DEFINITION Circular linked list: A (corrupt)
 * linked list in which a node’s next pointer points to an earlier node, so as
 * to make a loop in the linked list. EXAMPLE Input: A -> B -> C -> D -> E -> C
 * [the same C as earlier] Output: C
 */
public class Q2_5 {
    public static void main(String[] args) {
	SNode head = new SNode(10);

	SNode n1 = new SNode(20);
	head.next = n1;

	SNode n2 = new SNode(30);
	n1.next = n2;

	SNode n3 = new SNode(40);
	n2.next = n3;

	SNode n4 = new SNode(50);
	n3.next = n4;

	n4.next = n2;

	// SList.disp(head);
	// SList.detectCycle(head);
	System.out.println(getLoopBegin(head));
    }

    static SNode getLoopBegin(SNode head) {
	SNode slow = head, fast = head;
	SNode n1 = null;
	while (slow != null && fast != null && fast.next != null) {
	    slow = slow.next;
	    fast = fast.next.next;
	    if (slow == fast) {
		break;
	    }
	}
	if (fast.next != null) {
	    slow = head;
	    while (slow != fast) {
		slow = slow.next;
		fast = fast.next;
	    }
	    n1 = slow;
	}
	return n1;
    }
}
