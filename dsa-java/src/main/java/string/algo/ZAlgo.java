package string.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ZAlgo {

    public static void main(String[] args) {
	String s = "aacbyaaRaac";
//	System.out.println(Arrays.toString(calculatezk(s)));
	System.out.println(match("abc", "xyzabcopabrtyabcir"));
//	System.out.println(count("abc", "xyzabcopabrtyabcir"));
//	System.out.println(indexOf("abc", "xyzabcopabrtyabcir"));
    }

    static int indexOf(String p, String s) {
	int[] a = calculatezk(p + "#" + s);
	for (int i : a) {
	    if (i == p.length())
		return i;
	}
	return -1;
    }

    static int count(String p, String s) {
	int[] a = calculatezk(p + "#" + s);
	int count = 0;
	for (int i : a) {
	    if (i == p.length())
		count++;
	}
	return count;
    }

    static boolean match(String p, String s) {
//	int[] a = calculatezk(p + "#" + s);
//	for (int i : a) {
//	    if (i == p.length())
//		return true;
//	}
//	return false;
	return calculatezkOpt(p + "#" + s).contains(p.length());
    }

    static List<Integer> calculatezkOpt(String s) {
	char[] ch = s.toCharArray();
	int n = ch.length;
	Integer[] zk = new Integer[n];
	for (int i = 1; i < n; i++) {
	    zk[i] = zk(ch, i);
	}
	return new ArrayList(Arrays.asList(zk));
    }

    static int[] calculatezk(String s) {
	char[] ch = s.toCharArray();
	int n = ch.length;
	int[] zk = new int[n];
	for (int i = 1; i < n; i++) {
	    zk[i] = zk(ch, i);
	}
	return zk;
    }

    static int zk(char[] ch, int k) {
	int length = 0, count = 0;
	for (int i = k; i < ch.length; i++) {
	    if (ch[i] == ch[count++]) {
		length++;
	    } else {
		break;
	    }
	}
	return length;
    }

}
