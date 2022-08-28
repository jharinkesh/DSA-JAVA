package main.java.sorting.adnan;

public class Intersection {

    public static void main(String[] args) {
	int[] a = { 2, 3, 3, 5, 5, 6, 7, 7, 8, 12 };
	int[] b = { 5, 5, 6, 8, 8, 9, 10, 10 };
	int i = 0, j = 0;
	while (i < a.length && j < b.length) {
	    if (a[i] == b[j] && (i == 0 || a[i] != a[i - 1])) {
		System.out.println(a[i]);
		i++;
		j++;
	    } else if (a[i] < b[j]) {
		i++;
	    } else {
		j++;
	    }
	}
    }
}
