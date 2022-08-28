package main.java.arrays.gayle;

import java.util.Arrays;

/**
 * Write a method to decide if two strings are anagrams or not.
 */
public class Q1_4 {
    public static void main(String[] args) {
	// System.out.println(anagram("LISTEN", "SILENT"));
	// System.out.println(anagram("TRIANGLE", "INTEGRAL"));
	// System.out.println(anagram("TRIAXNGLE", "INTEYGRAL"));
	System.out.println(fact2(5));
    }

    static int fact2(int n) {
	for (int i = n - 1; i > 1; i--) {
	    n *= i;
	}
	return n;
    }

    static int fact(int n) {
	if (n == 0 || n == 1)
	    return n;
	return n * fact(n - 1);
    }

    static int pow(int b, int e) {
	if (e == 1)
	    return b;
	return b * pow(b, e - 1);
    }

    static int binary(int n) {
	int b = 0;
	int p = 1;
	while (n > 0) {
	    int r = n % 2;
	    b = b + r * p;
	    p = p * 10;
	    n = n / 2;
	}
	return b;
    }

    static boolean anagram(String a, String b) {
	char[] x = a.toCharArray(), y = b.toCharArray();
	if (a.length() == b.length()) {
	    Arrays.sort(x);
	    Arrays.sort(y);
	    for (int i = 0; i < a.length(); i++) {
		if (x[i] != y[i])
		    return false;
	    }
	}
	return true;
    }

}
