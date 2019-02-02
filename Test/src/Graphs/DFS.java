package Graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class DFS {

	static Map<Integer,LinkedList<Integer>> graphMap=new HashMap<Integer,LinkedList<Integer>>();
	//static Map<Integer,Boolean> visitTracker=new HashMap<Integer,Boolean>();

	List <Integer> visitTracker=new ArrayList<Integer>();
	
 public static void main(String[] args) {
	
	 DFS node=new DFS();
	 node.addNode(0, 1); 
	 node.addNode(0, 2); 
	 node.addNode(1, 2); 
	 node.addNode(2, 0); 
	 node.addNode(2, 3); 
	 node.addNode(3, 3); 

	 node.DfsSearch(2);

	 
}

private void addNode(int key, int value) {

	if(!graphMap.containsKey(key))
		graphMap.put(key, new LinkedList<Integer>());
	
		graphMap.get(key).add(value);
	
	
}

private void DfsSearch(int i) {

	LinkedList<Integer> stack= new LinkedList<Integer>();
	
	stack.addLast(i);
	
	
	while(!stack.isEmpty())
	{
		int sourceKey=stack.removeLast();
		System.out.print(sourceKey+" ");
		visitTracker.add(sourceKey );
		LinkedList<Integer> temp = null;
		if(graphMap.containsKey(sourceKey))
		  temp=graphMap.get(sourceKey);
		int index=0;
			while( index<temp.size()&&temp!=null)
			{
               if(!visitTracker.contains(temp.get(index))) 	
               {
            	   stack.addLast(temp.get(index));
               }
               index++;
            	   
			}
							
		
	}
	
}	
}
