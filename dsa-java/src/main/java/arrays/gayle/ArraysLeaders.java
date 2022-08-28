package main.java.arrays.gayle;

public class ArraysLeaders {

    public static void main(String[] args) {
	int[] a = { 7, 10, 4, 3, 6, 5, 2 };
	printLeaders(a);
    }

    static void printLeaders(int[] a) {
	int n = a.length;
	int currLeader = a[n - 1];
	System.out.println(currLeader);
	for (int i = n - 2; i >= 0; i--) {
	    if (a[i] > currLeader) {
		currLeader = a[i];
		System.out.println(currLeader);
	    }
	}
    }

}
