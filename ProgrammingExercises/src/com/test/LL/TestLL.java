package com.test.LL;

public class TestLL {

   
	public static void main(String[] args)
	{
		LinkedList ll=new LinkedList();
        ll.insertAtHead(11);
        ll.insertAtHead(5);
        ll.insertAtHead(3);
        ll.insertAtHead(7);
        
        System.out.println(ll);

        System.out.println(ll.findElement(1));
        //ll.deleteAtHead();
        System.out.println(ll);
		
	}
	
}
