
public class NumberPrint {

    public static void main(String[] args) {
	int range = 100;
	new Thread(new Printer(true, range)).start();
	new Thread(new Printer(false, range)).start();
    }

}

class Printer implements Runnable {
    final boolean ISEVEN;
    final int RANGE;

    Printer(boolean isEven, int range) {
	ISEVEN = isEven;
	RANGE = range;
    }

    @Override
    public void run() {
	print(1);
    }

    private void print(int i) {
	if (i <= RANGE) {
	    if (ISEVEN) {
		if (i % 2 == 0)
		    System.out.println(i);
	    } else {
		if (i % 2 != 0)
		    System.out.println(i);
	    }
	    print(++i);
	}
    }

}