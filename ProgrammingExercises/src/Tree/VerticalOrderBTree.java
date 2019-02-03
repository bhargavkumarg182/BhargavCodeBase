package Tree;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.Vector;

public class VerticalOrderBTree {

	 static class Node{
		
		int key;
		Node left;
		Node right;
		
		Node(int data){
			
			key=data;
			left=null;
			right=null;
			
		}
		
	}
	 
	 public static void main(String[] args) {
		
		 

		 int arr[]= {1,2,3,4,5};
		 System.out.println(arr[-1]);
		  System.out.println(arr[-2]);
		 Node root=new Node(1);
		 root.left=new Node(2);
		 root.left.left=new Node(4);
		 root.left.right=new Node(5);
		 root.right=new Node(3);
		 root.right.left=new Node(6);
		 root.right.right=new Node(7);
		 
	        Vector<Node> vec1=new Vector<Node>();

		  
	        
		 
		 
	}

	private static void printVerticalOrder(Node root) {
		TreeMap<Integer,Vector<Integer>> tracker = new TreeMap<Integer,Vector<Integer>>(); 

		int def=0;
		getVerticalOrder(tracker,def,root);
		
		for(Entry<Integer,Vector<Integer>> e:tracker.entrySet())
		{
			System.out.println(e.getValue().get(0));
		}
		
	}

	private static void getVerticalOrder(TreeMap<Integer, Vector<Integer>> tracker, int def, Node root) {

		if(root==null)
			return;
		
		Vector<Integer> vectorValueInTracker=tracker.get(def);
		if(vectorValueInTracker==null)
			vectorValueInTracker=new Vector<Integer>();

		vectorValueInTracker.add(root.key);
		
		tracker.put(def, vectorValueInTracker);
		getVerticalOrder(tracker, def-1, root.left);
		getVerticalOrder(tracker, def+1, root.right);

	}
	
		
}
