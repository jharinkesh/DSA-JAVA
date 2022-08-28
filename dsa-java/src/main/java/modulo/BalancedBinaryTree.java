package modulo;

public class BalancedBinaryTree {

	public static void main(String[] args) {
		
		System.out.println(bbt(3));
	}
	
	// h=3 15*15 + 2.15.3 = 315
	
	static int bbt(int h) {
		if(h==0) {
			return 1;
		}
		if(h==1) {
			return 3;
		}
		
		int x = bbt(h-1);
		int y = bbt(h-2);
		return x*x + 2* x* y;
	}
}
