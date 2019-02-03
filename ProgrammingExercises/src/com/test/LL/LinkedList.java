package com.test.LL;

public class LinkedList {

	private Node head;

	public void insertAtHead(int data)
	{
		Node newNode=new Node(data);
		newNode.setNextNode(this.head);
        this.head=newNode;
	}
	
	@Override
	public String toString(){
		String result="{";
		Node current=this.head;
		while(current!=null)
		{
			result= result+ current.toString()+",";
			current=current.getNextNode();
		}
		
		return result;
	}

	public void deleteAtHead() {

		head=head.getNextNode();		
	}

	public boolean findElement(int i) {
		
		Node current=head;
		while(current!=null)
		{
		   if(current.getData()==i)
			   return true;
		   current=current.getNextNode();
			
		}
		return false;
	}
	
}
