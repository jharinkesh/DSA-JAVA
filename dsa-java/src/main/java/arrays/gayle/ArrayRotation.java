package main.java.arrays.gayle;

import java.util.Arrays;

public class ArrayRotation {

    public static void main(String[] args) {
	int[] a = { 1, 2, 3, 4, 5 };
	// rotateByOne(a);
	// rotate(a, 2);
	// reverse(a, 0, a.length - 1);
	rotateByReverse(a, 2);
	System.out.println(Arrays.toString(a));
    }

    static void rotateByReverse(int[] a, int d) {
	reverse(a, 0, d - 1);
	reverse(a, d, a.length - 1);
	reverse(a, 0, a.length - 1);
    }

    static void reverse(int[] a, int i, int j) {
	while (i < j) {
	    int t = a[i];
	    a[i] = a[j];
	    a[j] = t;
	    i++;
	    j--;
	}
    }

    static void rotate(int[] a, int d) {
	for (int i = 0; i < d; i++) {
	    rotateByOne(a);
	}
    }

    static void rotateByOne(int[] a) {
	int t = a[0];
	int n = a.length;
	for (int i = 1; i < n; i++) {
	    a[i - 1] = a[i];
	}
	a[n - 1] = t;
    }
}
