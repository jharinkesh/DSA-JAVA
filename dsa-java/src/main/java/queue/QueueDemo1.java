package queue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QueueDemo1 {

    public static void main(String[] args) {
	List<String> list = new ArrayList<>();
	list.add("BALA-IN");
	list.add("RAMA-US");
	list.add("HARI-US");
	list.add("RAVI-UK");
	list.add("NANI-NP");
	list.add("SIVA-CN");

//	System.out.println(parse("BALA-IN AND RAVI-UK", list));
//	System.out.println(parse("BALA-IN AND MAVI-UN", list));
//	System.out.println(parse("SIVA-CN OR MAVI-UN", list));
//	System.out.println(parse("HIRA-CN OR MAVI-UN", list));
//	System.out.println(parse("BALA-IN AND RAVI-UK AND SIVA-CN", list));
//	System.out.println(parse("BALA-IN AND RAVI-UK AND GEVI-CN", list));
//
//	System.out.println(parse("BALA-IN AND RAVI-UK", list));
//	System.out.println(parse("BALA-IN AND MAVI-UN", list));
//	System.out.println(parse("SIVA-CN OR MAVI-UN", list));
//	System.out.println(parse("HIRA-CN OR MAVI-UN", list));
//	System.out.println(parse("BALA-IN AND RAVI-UK AND SIVA-CN", list));
//	System.out.println(parse("[BALA-IN AND RAVI-UK] OR GEVI-CN", list));

	System.out.println(parse("[BALA-IN AND RAVI-UK] OR GEVI-CN", list));

	System.out.println(parse("[BALA-IN OR KOI-UK] AND RAMA-US AND NANI-NP", list));
	System.out.println(parse("BALA-IN AND [KOI-UK OR RAMA-US] AND NANI-NP", list));

    }

    static boolean parse(String condition, List<String> features) {
	condition = condition.replace("[", "[ ").replace("]", " ]");
	return execute(Arrays.asList(condition.trim().split(" ")), features);
    }

    static int getClosingIndex(int start, List<String> conditions) {
	while (start < conditions.size()) {
	    if (conditions.get(start).trim().equals("]"))
		return start;
	    start++;
	}
	return -1;
    }

    static boolean execute(List<String> splits, List<String> features) {
	String operator = "OR";
	Boolean result = false;
	int i = 0;
	while (i < splits.size()) {
	    String word = splits.get(i).trim();
	    if (word.equals("[")) {
		int last = getClosingIndex(i, splits);
		boolean res = execute(splits.subList(i + 1, last), features);
		switch (operator) {
		case "OR":
		    result = result || res;
		    break;
		case "AND":
		    result = result && res;
		    break;
		}
		i = last + 1;
		continue;
	    }

	    if (word.equals("AND") || word.equals("OR")) {
		operator = word;
	    } else {
		switch (operator) {
		case "OR":
		    result = result || features.contains(word);
		    break;
		case "AND":
		    result = result && features.contains(word);
		    break;
		}
	    }
	    i++;
	}

	return result;
    }

    class Node {
	String data;
	Node left, right;
    }

    public static void main2(String[] args) {
	ArrayQueue q = new ArrayQueue(5);
	q.enqueu(3);
	q.enqueu(9);
	q.enqueu(5);
	q.enqueu(92);
	q.enqueu(51);
	q.enqueu(91);
	q.enqueu(51);
	q.disp();

	// System.out.println("\n" + q.dequeue());
	q.dequeue();
	q.dequeue();
	q.dequeue();

	q.disp();
    }

}

class ArrayQueue {
    int[] data;
    final int cap;
    int size;

    public ArrayQueue(int cap) {
	this.cap = cap;
	size = 0;
	data = new int[cap];
    }

    void enqueu(int x) {
	if (size == cap)
	    return;
	data[size++] = x;
    }

    int dequeue() {
	if (size == 0)
	    return -1;
	int f = data[0];

	for (int i = 0; i < size - 1; i++) {
	    data[i] = data[i + 1];
	}
	size--;
	return f;
    }

    int front() {
	if (size == 0)
	    return -1;
	return 0;
    }

    int rear() {
	if (size == 0)
	    return -1;
	return size - 1;
    }

    void disp() {
	System.out.println();
	for (int i = 0; i < size; i++) {
	    System.out.print(" " + data[i]);
	}
    }

}