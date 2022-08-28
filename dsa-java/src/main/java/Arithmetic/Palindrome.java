package Arithmetic;

class Palindrome {
    public static void main(String... args) {
	int num = Integer.parseInt(args[0]);
	System.out.println(isPalindrome(num));
    }

    static boolean isPalindrome(int n) {
	int rev = 0, r = 0, orig = n;
	while (n > 0) {
	    r = n % 10;
	    rev = rev * 10 + r;
	    n = n / 10;
	}
	return rev == orig;
    }

}