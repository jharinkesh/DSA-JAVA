package queue;

public class ArrayDeque {
    int size, cap;
    int[] a;

    public static void main(String[] args) {
	ArrayDeque q = new ArrayDeque(5);
	q.insertF(23);
	q.insertF(40);
	q.insertF(90);
	q.insertF(49);
	q.disp();
	q.deleteF();
	q.deleteF();
	q.disp();

    }

    ArrayDeque(int cap) {
	this.cap = cap;
	a = new int[cap];
    }

    void insertF(int x) {
	if (size == cap)
	    return;
	for (int i = size; i > 0; i--) {
	    a[i] = a[i - 1];
	}

	a[0] = x;
	size++;
    }

    void deleteF() {
	if (size == 0)
	    return;
	for (int i = 0; i < size; i++)
	    a[i] = a[i + 1];
	size--;

    }

    void disp() {
	if (size > 0) {
	    System.out.println("\n---> ");
	    for (int i = 0; i < size; i++)
		System.out.print(" " + a[i]);
	}
    }

}
