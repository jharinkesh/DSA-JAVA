package Arithmetic;

class DecToBin {
    public static void main(String... args) {
	int n = Integer.parseInt(args[0]);
	int r = 0, bin = 0, p = 1;
	while (n > 0) {
	    r = n % 2;
	    bin = bin + r * p;
	    p = p * 10;
	    n = n / 2;
	}
	log(bin);
    }

    static void log(Object obj) {
	System.out.println(obj.toString());
    }
}