package recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsequence {
	
	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		System.out.println(subs("abcd", l));
	}
	
	static List<String> subs(String s, List<String> op){
		if(s.isEmpty()) {
			op.add("");
			return op;
		}
		List<String> result = subs(s.substring(1), op);
		String t = s.substring(0, 1);
		List<String> output = new ArrayList<String>(result);
		for(String r:result)
			output.add(t+r);
		return output;
	}
}
