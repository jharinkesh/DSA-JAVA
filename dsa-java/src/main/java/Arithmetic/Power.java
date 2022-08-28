package Arithmetic;

class Power {
    public static void main(String... args) {
	int base = Integer.parseInt(args[0]);
	int exp = Integer.parseInt(args[1]);
	System.out.println(powRec(base, exp));
    }

    static int pow(int base, int exp) {
	int p = base;
	for (int i = 1; i < exp; i++) {
	    p = p * base;
	}
	return p;
    }

    static int powRec(int base, int exp) {
	if (exp == 0)
	    return 1;
	return base * powRec(base, exp - 1);
    }
}