package linkedlist;

public class DuplicateRemove {

    public static void main(String[] args) {
	SLink list = new SLink();
	list.add(20).add(40).add(40).add(40).add(50).add(50);
	list.disp();
	removeDuplicate(list.head);
	list.disp();

    }

    static void removeDuplicate(Node head) {
	Node prev = head, current = prev.next;
	while (current != null) {
	    if (prev.data == current.data) {
		prev.next = current.next;
	    } else {
		prev = current;
	    }
	    current = current.next;
	}
    }

}
