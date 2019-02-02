package com.test.LL;

public class Node {

	private int data;
	private Node next;

	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getNextNode() {
		return next;
	}
	public void setNextNode(Node next) {
		this.next = next;
	}
	Node(int data)
	{
		this.data=data;
	}
	@Override
	public String toString()
	{
		return "data: "+this.data;
	}
	
}
