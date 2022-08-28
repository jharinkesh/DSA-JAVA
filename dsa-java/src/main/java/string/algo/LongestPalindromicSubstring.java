package string.algo;

public class LongestPalindromicSubstring {

    public static void main(String[] args) {
	String s = "ababxbabcba";
	System.out.println(lps(s));
    }

    static int lps(String s) {
	char[] ch = s.toCharArray();
	int maxl = 0, n = ch.length;
	for (int i = 0; i < n; i++) {
	    // odd length
	    int l = i, r = i;
	    while (l >= 0 && r < n && ch[r] == ch[l]) {
		int len = r - l + 1;
		if (len > maxl) {
		    maxl = len;
		}
		l--;
		r++;
	    }

	    l = i;
	    r = i + 1;
	    // even length
	    while (l >= 0 && r < n && ch[r] == ch[l]) {
		int len = r - l + 1;
		if (len > maxl) {
		    maxl = len;
		}
		l--;
		r++;
	    }

	}

	return maxl;
    }
}
