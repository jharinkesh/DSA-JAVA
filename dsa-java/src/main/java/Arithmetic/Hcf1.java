package Arithmetic;

class Hcf1 {
    public static void main(String... args) {
	System.out.println(hcf(18, 10));
    }

    static int hcf(int a, int b) {
	int hcf = 1, r = 1;
	if (a > b) {
	    while (r != 0) {
		r = a % b;
		a = b;
		b = r;
	    }
	    hcf = a;
	} else {
	    while (r != 0) {
		r = b % a;
		b = a;
		a = r;
	    }
	    hcf = b;
	}
	return hcf;
    }

}