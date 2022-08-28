package main.java.sorting.adnan;

import java.util.Arrays;

public class MergeTwoSortedArray {

    public static void main(String[] args) {
	int[] a = { 2, 4, 6, 8 };
	int[] b = { 3, 5, 7, 9 };
	int[] c = new int[a.length + b.length];
	int i = 0, j = 0, k = 0;
	while (i < a.length && j < b.length) {
	    if (a[i] < b[j]) {
		c[k++] = a[i++];
	    } else {
		c[k++] = b[j++];
	    }
	}

	while (i < a.length) {
	    c[k++] = a[i++];
	}

	while (j < b.length) {
	    c[k++] = b[j++];
	}

	System.out.println(Arrays.toString(c));
    }
}
