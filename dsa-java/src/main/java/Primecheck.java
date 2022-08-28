
public class Primecheck {

    public static void main(String[] args) {
	// System.out.println(isPrime(21));

//	int[] a = { 1, 2, 5, 7 };
//	int max = a[a.length - 1];
//	boolean c[] = new boolean[max + 1];
//	for (int e : a) {
//	    c[e] = true;
//	}
//
//	for (int i = 1; i <= max; i++) {
//	    if (!c[i])
//		System.out.print(" " + i);
//	}

	Stack stack = new Stack(3);
	stack.push(1);
	stack.push(2);
	stack.push(3);
	stack.push(4);

	System.out.println(stack.pop());
	System.out.println(stack.pop());
	System.out.println(stack.pop());
	System.out.println(stack.pop());

    }

    static boolean isPrime(int n) {
	for (int i = 2; i < n / 2; i++) {
	    if (n % i == 0)
		return false;
	}
	return true;
    }

}

// SELECT salary from Employee emp where emp.salary <(select max(salary) from Employee) order by emp.salary DESC Limit 1;

class CustomException extends Exception {

    /**
     * 
     */
    private static final long serialVersionUID = 194934343434L;

    public CustomException(int message) {
    }

}

class Stack {
    Integer[] data;
    final int capacity;
    int top;

    Stack(int capacity) {
	this.capacity = capacity;
	data = new Integer[capacity];
	this.top = -1;
    }

    void push(int x) {
	if (top < capacity - 1) {
	    data[++top] = x;
	}
    }

    Integer pop() {
	if (top >= 0) {
	    return data[top--];
	} else {
	    return null;
	}
    }

}
