package main.java.arrays.gayle;

import java.util.Arrays;

/**
 * Given an image represented by an NxN matrix, where each pixel in the image is
 * 4 bytes, write a method to rotate the image by 90 degrees. Can you do this in
 * place?
 */
public class Q1_6 {
    public static void main(String[] args) {
	int[][] x = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
	disp(rotate(x));
    }

    static void disp(int[][] x) {
	System.out.println();
	for (int i = 0; i < x.length; i++) {
	    System.out.println(Arrays.toString(x[i]));
	}
    }

    static int[][] rotate(int[][] x) {
	int n = x.length;
	int a[][] = new int[n][n];
	for (int i = 0; i < n; i++) {
	    for (int j = 0; j < n; j++) {
		a[j][n - 1 - i] = x[i][j];
	    }
	}
	return a;
    }
}
