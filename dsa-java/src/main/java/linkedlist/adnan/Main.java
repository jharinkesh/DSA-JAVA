package main.java.linkedlist.adnan;

import linkedlist.SLink;
import linkedlist.SNode;

public class Main {

    public static void main(String[] args) {

	SNode n1 = new SNode(3);
	SNode n2 = new SNode(1);
	SNode n3 = new SNode(4);

	n1.next = n2;
	n2.next = n3;

	SNode n11 = new SNode(7);
	SNode n22 = new SNode(0);
	SNode n33 = new SNode(9);

	n11.next = n22;
	n22.next = n33;

	SLink.disp(AddLIstIntegers.add(n1, n11));

    }
}
