package main.java.linkedlist.gayle;

/**
 * Write code to remove duplicates from an unsorted linked list. FOLLOW UP How
 * would you solve this problem if a temporary buffer is not allowed?
 */
public class Q2_2 {
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
	System.out.println(findNthFromLast(list.head, 2).data);
    }

    static SNode findNthFromLast(SNode head, int n) {
	SNode n1 = head, n2 = head;
	int count = 0;
	while (n2 != null) {
	    count++;
	    n1 = n2;
	}
	return null;
    }
}
