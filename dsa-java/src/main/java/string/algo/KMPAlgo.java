package string.algo;

public class KMPAlgo {
    public static void main(String[] args) {
//	String s = "abcdabcddacaabcdyabcdybcdyxac";
//	String p = "abcdyxyzabcdy";
//	String p = "xyzsjsh";
//	String p = "aabcdabcyaa";
//	System.out.println(getLongestPrefixNext(p, p.length()));
	String s = "ABCDABCDABCABABCD";
	String p = "ABCAB";
	System.out.println(match(s, p));

    }

    static boolean match(String s, String p) {
	int count = 0, j = 0;
	for (int i = 0; i < s.length(); i++) {
	    if (s.charAt(i) == p.charAt(j)) {
		count++;
		j++;
	    } else {
		int lps = getLongestPrefixNext(p, j);
		if (lps != -1) {
		    j = lps;
		    i--;
		} else {
		    j = 0;
		    count = 0;
		}
	    }
	    if (count == p.length())
		return true;
	}
	return false;
    }

    static int getLongestPrefixNext(String s, int index) {
	int next = -1;
	s = s.substring(0, index);
	int n = s.length();
	for (int i = 0; i <= n / 2; i++) {
	    if (s.substring(0, i + 1).equals(s.substring(n - i - 1))) {
		next = i + 1;
	    }
	}

	return next;
    }

}
