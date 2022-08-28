package sorting;

import java.util.Arrays;

public class MySort {

    public static void main(String[] args) {
	int[] a = { 7, 2, 4, 5, 1, 7, 9, 1, 3, 9, 0 };
	int mxi = 0, mni = a.length - 1;
	int i = 0, j = a.length - 1;
	while (i < a.length && j < a.length && i <= j) {
	    mni = i;
	    mxi = j;
	    for (int x = i; x <= j; x++) {
		if (a[x] < a[mni])
		    mni = x;
		if (a[x] > a[mxi])
		    mxi = x;
	    }
	    int t = a[i];
	    a[i] = a[mni];
	    a[mni] = t;
	    t = a[j];
	    a[j] = a[mxi];
	    a[mxi] = t;
	    i++;
	    j--;
	}
	System.out.println(Arrays.toString(a));

    }
}
