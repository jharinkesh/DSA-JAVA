package main.java.Arithmetic;

public class ReverseNumber {

    public static void main(String[] args) {
	System.out.println(reverse(12340));
    }

    static int reverse(int n) {
	int rev = 0;
	while (n > 0) {
	    int r = n % 10;
	    rev = rev * 10 + r;
	    n = n / 10;
	}
	return rev;
    }
}
