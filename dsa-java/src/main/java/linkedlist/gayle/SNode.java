package main.java.linkedlist.gayle;

public class SNode {
    int data;
    SNode next;

    SNode(int data) {
	this.data = data;
    }

    SNode(int data, SNode next) {
	this.data = data;
	this.next = next;
    }

    @Override
    public String toString() {
	return "SNode [data=" + data + ", next=" + next.data + "]";
    }
}
