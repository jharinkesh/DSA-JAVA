package heap;

import java.util.Arrays;

public class HeapDemo {

    public static void main2(String[] args) {
	MinHeap heap = new MinHeap(10);
//	heap.init(10, 20, 15, 40, 50, 100, 25, 45);
//	heap.init(40, 20, 30, 35, 25, 80, 32, 100, 70, 60);
	heap.init(20, 25, 30, 35, 40, 80, 32, 100, 70, 60);
	heap.disp();
	// heap.insert(12);
//	heap.disp();
	// heap.minheapify(0);
//	System.out.println("\n" + heap.extractMin());
//	heap.disp();
	int n = heap.size;
	// heap sort
	System.out.println();
	for (int i = 0; i < n; i++) {
	    System.out.print(heap.extractMin() + " ");
	}
    }

    public static void main(String[] args) {
	int[] a = { 9, 2, 5, 8, 11, 99, 200 };
	sort(a);
	System.out.println(Arrays.toString(a));
    }

    static void sort(int[] a) {
	MinHeap heap = new MinHeap(a.length);
	Arrays.stream(a).forEach(x -> heap.insert(x));
	for (int i = 0; i < a.length; i++) {
	    a[i] = heap.extractMin();
	    System.out.println(a[i]);
	}
    }
}

class MinHeap {
    int[] a;
    int size, capacity;

    MinHeap(int capacity) {
	a = new int[capacity];
	this.capacity = capacity;
    }

    public Integer extractMin() {
	if (size == 0)
	    return null;
	int t = a[0];
	if (size == 1) {
	    size--;
	    return t;
	}
	swap(0, size - 1);
	size--;
	minheapify(0);
	return t;
    }

    void minheapify(int i) {
	int lt = left(i), rt = right(i), min = i;
	if (lt < size && a[lt] < a[i]) {
	    min = lt;
	}
	if (rt < size && a[rt] < a[min]) {
	    min = rt;
	}
	if (min != i) {
	    swap(i, min);
	    minheapify(min);
	}

    }

    void insert(int x) {
	if (size == capacity)
	    return;
	size++;
	a[size - 1] = x;
	for (int i = size - 1; a[parent(i)] > a[i] && i != 0;) {
	    int prt = parent(i);
	    swap(i, prt);
	    i = prt;
	}
    }

    void swap(int i, int j) {
	int t = a[i];
	a[i] = a[j];
	a[j] = t;
    }

    int left(int i) {
	return 2 * i + 1;
    }

    int right(int i) {
	return left(i) + 1;
    }

    int parent(int i) {
	return (i - 1) / 2;
    }

    void disp() {
	System.out.println();
	for (int i = 0; i < size; i++) {
	    System.out.print(a[i] + " ");
	}
    }

    void init(int... x) {
	for (int i = 0; i < x.length; i++) {
	    a[i] = x[i];
	}
	this.size = x.length;
    }
}
