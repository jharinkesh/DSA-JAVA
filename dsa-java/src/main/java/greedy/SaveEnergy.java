package greedy;

public class SaveEnergy {
	
	public static void main(String[] args) {
		int n = 4;
		int a[] = {2, 2, 3, 4};
		int i = 0,sum = 0;
		while(i<(n-1)) {
			int j = i+1;
			while(j<(n-1)) {
				if(mod(a[i])>mod(a[j]) || (mod(a[i]) == mod(a[j]) && a[i]>0 )) {
					break;
				}else {
					j++;
				}
			}
			sum += (j-i)*a[i] + (j*j - i*i)*a[i]*a[i];
			i = j;
		}
		
		System.out.println(sum);
	}
	
	static int mod(int x) {
		return Math.abs(x);
	}

}
