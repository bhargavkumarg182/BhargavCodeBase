package com.test.LL;

public class DoublyLinkedList {

	private DoublyLinkedNode head;
	public void insertAtHead(int data)
	{
		DoublyLinkedNode newNode=new DoublyLinkedNode(data);
		newNode.setNextNode(this.head);
		if(this.head!=null)
		{
			head.setPreviousNode(newNode);
		}
		this.head=newNode;
	}
	@Override
	public String toString(){
		String result="{";
		DoublyLinkedNode current=this.head;
		while(current!=null)
		{
			result= result+ current.toString()+",";
			current=current.getNextNode();
		}
		
		return result;
	}
}
