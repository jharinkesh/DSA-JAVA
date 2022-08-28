package linkedlist;

public class PalindromeCHeck {

    public static void main(String[] args) {
	SLink list = new SLink();
	list.add(1).add(2).add(3).add(4).add(2).add(1);
	list.disp();
	System.out.println(isPalindrome(list.head));
    }

    static boolean isPalindrome(Node head) {

	Node slow = head, fast = head;
	while (fast != null && fast.next != null) {
	    slow = slow.next;
	    fast = fast.next.next;
	}

	Node l1 = head;
	Node l2 = reverse(slow);

	while (l1 != null && l2 != null) {
	    if (l1.data != l2.data)
		return false;

	    l1 = l1.next;
	    l2 = l2.next;
	}

	return true;
    }

    static Node reverse(Node head) {
	Node n1 = head, prev = null;
	while (n1 != null) {
	    Node t = n1.next;
	    n1.next = prev;
	    prev = n1;
	    n1 = t;
	}
	return prev;
    }

}
