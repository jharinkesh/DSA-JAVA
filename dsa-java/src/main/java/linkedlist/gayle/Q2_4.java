package main.java.linkedlist.gayle;

/**
 * You have two numbers represented by a linked list, where each node contains a
 * single digit. The digits are stored in reverse order, such that the 1’s digit
 * is at the head of the list. Write a function that adds the two numbers and
 * returns the sum as a linked list. EXAMPLE Input: (3 -> 1 -> 5), (5 -> 9 -> 2)
 * Output: 8 -> 0 -> 8
 */
public class Q2_4 {

    public static void main(String[] args) {
	SList list1 = new SList();
	list1.add(3);
	list1.add(1);
	list1.add(5);

	SList list2 = new SList();
	list2.add(5);
	list2.add(9);
	list2.add(2);

	sum(list1.head, list2.head).disp();
    }

    static SList sum(SNode head1, SNode head2) {
	SNode n1 = head1, n2 = head2;
	Integer result = 0, mul = 1;
	while (n1 != null || n2 != null) {
	    if (n1 != null) {
		result += n1.data * mul;
		n1 = n1.next;
	    }
	    if (n2 != null) {
		result += n2.data * mul;
		n2 = n2.next;
	    }
	    mul *= 10;
	}

	char[] chars = result.toString().toCharArray();
	SList ls = new SList();
	for (char ch : chars) {
	    ls.add(Integer.parseInt(ch + ""));
	}
	return ls;
    }

}
