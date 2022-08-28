package string.algo;

public class PatternMtching {
public static void main(String[] args) {
	String s = "abcbbdecd";
	String p = "bde";
	System.out.println(match(s, p));
}

static boolean match(String s,String p) {
	char[] s1 = s.toCharArray();
	char[] p1 = p.toCharArray();
	for (int i = 0; i <= s1.length - p1.length; i++) {
		int count = 0;
		for(int j=0;j<p1.length;j++) {
			if(s1[i+j] == p1[j])
				count++;
			else
				break;
			if(count == p1.length)
				return true;
		}
	}
	return false;
}
}
