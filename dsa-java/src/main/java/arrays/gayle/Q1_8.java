package main.java.arrays.gayle;

/**
 * Assume you have a method isSubstring which checks if one word is a substring
 * of another. Given two strings, s1 and s2, write code to check if s2 is a
 * rotation of s1 using only one call to isSubstring (i.e., “waterbottle” is a
 * rotation of “erbottlewat”).
 */
public class Q1_8 {
    public static void main(String[] args) {
	String s1 = "waterbottle";
	String s2 = "erbottlewat";
	System.out.println(isRotation(s1, s2));
	System.out.println(isRotation("laila", "alial"));
	System.out.println(isRotation("laila", "ailal"));
    }

    static boolean isRotation(String s1, String s2) {
	return s2.concat(s2).contains(s1);
    }
}
