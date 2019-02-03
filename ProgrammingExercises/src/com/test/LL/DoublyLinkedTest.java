package com.test.LL;

public class DoublyLinkedTest {

	public static void main(String[] args) {
		DoublyLinkedList dl=new DoublyLinkedList();
		dl.insertAtHead(11);
		dl.insertAtHead(15);
		dl.insertAtHead(10);

		dl.insertAtHead(13);
		System.out.println(dl.toString());

	}
}
