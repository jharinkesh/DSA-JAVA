package main.java.arrays.gayle;

/**
 * Write code to reverse a C-Style String. (C-String means that “abcd” is
 * represented as five characters, including the null character.)
 */
public class Q1_2 {
    public static void main(String[] args) {
	System.out.println(reverse("abcdefgh\0"));
    }

    static String reverse(String s) {
	int n = s.length();
	char[] output = new char[n];
	for (int i = 0; i <= n - 2; i++) {
	    output[i] = s.charAt(n - 2 - i);
	    output[n - 2 - i] = s.charAt(i);
	}
	output[n - 1] = s.charAt(n - 1);
	return new String(output);
    }

}
