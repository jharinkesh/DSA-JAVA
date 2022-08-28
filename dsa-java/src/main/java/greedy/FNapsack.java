package greedy;

import java.io.ObjectInputStream.GetField;
import java.util.Arrays;

public class FNapsack {
	public static void main(String[] args) {
		Item[] items= {new Item(300,150),new Item(15,30),new Item(40,10), new Item(200,5)};
		System.out.println(getKnapsack(items, 18));
	}
	
	static double getKnapsack(Item[] items, int s) {
		Arrays.parallelSort(items);
		double val = 0;
		for(Item item:items) {
			if(item.weight<=s) {
				val = val + item.val;
				s = s - item.weight;
			}else {
				val = val + (item.val/item.weight) * s;
				break;
			}
		}
		
		return val;
	}
	
	static double getNKnapsack(NItem[] items, int s) {
		Arrays.parallelSort(items, (x,y)-> (int)((y.val/y.weight) - (x.val/x.weight)));
		double val = 0;
//		Arrays.stream(items).forEach(action).;
		for(NItem item:items) {
			if(item.weight<=s) {
				val = val + item.val;
				s = s - item.weight;
			}else {
				val = val + (item.val/item.weight) * s;
				break;
			}
		}
		
		return val;
	}
	
}

class NItem {
	double val;
	int weight;
	public NItem(double val, int weight) {
		super();
		this.val = val;
		this.weight = weight;
	}
}



class Item implements Comparable<Item>{
	double val;
	int weight;
	public Item(double val, int weight) {
		super();
		this.val = val;
		this.weight = weight;
	}
	
	public int compareTo(Item o) {
		return (int)((o.val/o.weight) - (this.val/this.weight));
	}

	@Override
	public String toString() {
		return "Item [val=" + val + ", weight=" + weight + "]";
	}	
	
}
