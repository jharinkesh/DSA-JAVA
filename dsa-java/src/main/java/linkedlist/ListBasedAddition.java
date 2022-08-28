package linkedlist;

public class ListBasedAddition {

    public static void main(String[] args) {
	SLink l1 = new SLink();
	l1.add(3).add(4);
	SLink l2 = new SLink();
	l2.add(7).add(0).add(9);
	add(l1, l2).disp();
    }

    static SLink add(SLink l1, SLink l2) {
	SLink list = new SLink();
	int carry = 0;
	Node n1 = l1.head, n2 = l2.head;
	while (n1 != null | n2 != null) {
	    int a = (n1 != null) ? n1.data : 0;
	    int b = (n2 != null) ? n2.data : 0;
	    int r = a + b + carry;
	    list.add(r % 10);
	    carry = r / 10;
	    if (n1 != null)
		n1 = n1.next;
	    if (n2 != null)
		n2 = n2.next;
	}

	if (carry > 0)
	    list.add(carry);

	return list;
    }

}
