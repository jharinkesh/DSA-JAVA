package main.java.arrays.gayle;

/**
 * Implement an algorithm to determine if a string has all unique characters.
 * What if you can not use additional data structures?
 */
public class Q1_1 {
    public static void main(String[] args) {
	System.out.println(isUnique("hello baby"));
	System.out.println(isUnique("babyb"));
	System.out.println(isUnique("abcdefgh"));
    }

    static boolean isUnique(String s) {
	boolean unique = true;
	if (s != null && s.length() > 1) {
	    String substring = s.substring(1);
	    unique = !substring.contains(s.charAt(0) + "");
	    if (unique) {
		return isUnique(substring);
	    }
	}
	return unique;
    }

}
