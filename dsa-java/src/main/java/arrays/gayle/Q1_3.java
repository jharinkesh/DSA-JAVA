package main.java.arrays.gayle;

/**
 * Design an algorithm and write code to remove the duplicate characters in a
 * string without using any additional buffer. NOTE: One or two additional
 * variables are fine. An extra copy of the array is not.
 */
public class Q1_3 {
    public static void main(String[] args) {
	System.out.println(removeDuplicate("abcdaefghgad".toCharArray()));
    }

    static char[] removeDuplicate(char[] s) {
	for (int i = 0; i < s.length - 1; i++) {
	    for (int j = i + 1; j < s.length; j++) {
		if (s[j] == s[i]) {
		    s[j] = '\0';
		}
	    }
	}
	return s;
    }
}
