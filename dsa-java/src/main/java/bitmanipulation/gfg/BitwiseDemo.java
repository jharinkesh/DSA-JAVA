package main.java.bitmanipulation.gfg;

public class BitwiseDemo {

    public static void main(String[] args) {

	System.out.println(powerOfTwo(32));
	// System.out.println(countSetBits(13));
    }

    static boolean powerOfTwo(int n) {
	if (n == 1)
	    return true;
	return n % 2 == 0 && powerOfTwo(n / 2);
    }

    static int countSetBits(int n) {
	int res = 0;
	while (n > 0) {
	    if (n % 2 != 0) // n&1 == 1
		res++;
	    n = n / 2; // n = n/2
	}
	return res;
    }
}
