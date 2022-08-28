package Arithmetic;

class Rot {
    public static void main(String... args) {
	String org = args[0];
	for (int i = 1; i < args.length; i++) {
	    check(org, args[i]);
	}
    }

    static void check(String org, String s) {
	if ((s + s).contains(org)) {
	    System.out.println("rotation");
	}
    }

}