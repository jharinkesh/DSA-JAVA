package greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JwelaryLoot {
	
	public static void main(String[] args) {
		JItem[] items = {
				new JItem(10, 5),
				new JItem(5, 10),
				new JItem(20, 20),
				new JItem(10, 30),
				new JItem(30, 15),
		};
		
		List<Integer> bags = new ArrayList<>();
		bags.add(30);
		bags.add(25);
		bags.add(12);
		
		System.out.println(getMaxProfit(items, bags));
	}
	
	
	static int getMaxProfit(JItem[] items, List<Integer> bags) {
		Arrays.parallelSort(items);
		Collections.sort(bags);
		int maxVal = 0;
		for (JItem item:items) {
			if(bags.isEmpty())
				break;
			int index = getSuitableIndex(item.mass, bags);
			if(index!=-1) {
				maxVal +=item.val;
				bags.remove(index);
			}
		}
		return maxVal;
	}
	
	static int getSuitableIndex(int mass, List<Integer> bags) {
		for(int i=0;i<bags.size();i++) {
			if(bags.get(i)>=mass)
				return i;
		}
		return -1;
	}
}


class JItem implements Comparable<JItem>{
	int mass;
	int val;
	public JItem(int mass, int val) {
		super();
		this.mass = mass;
		this.val = val;
	}
	@Override
	public int compareTo(JItem o) {
		return o.val - this.val;
	}
	
}