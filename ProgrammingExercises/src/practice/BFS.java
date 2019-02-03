package practice;

import java.util.Iterator;
import java.util.LinkedList;

public class BFS {

	 private int V;   // No. of vertices 
	    private LinkedList<Integer> adj[]; //Adjacency Lists 
	  
	    // Constructor 
	    BFS(int v) 
	    { 
	        V = v; 
	        adj = new LinkedList[v]; 
	        for (int i=0; i<v; ++i) 
	            adj[i] = new LinkedList(); 
	    } 
	  
	    // Function to add an edge into the graph 
	    void addEdge(int v,int w) 
	    { 
	        adj[v].add(w); 
	    } 
	 public static void main(String args[]) 
	    { 
	        BFS g = new BFS(4); 
	  
	        g.addEdge(0, 1); 
	        g.addEdge(0, 2); 
	        g.addEdge(1, 2); 
	        g.addEdge(2, 0); 
	        g.addEdge(2, 3); 
	        g.addEdge(3, 3); 
	  
	        System.out.println("Following is Breadth First Traversal "+ 
	                           "(starting from vertex 2)"); 
	  
	        g.BFS(2); 
	    }

	private void BFS(int i) {

	LinkedList<Integer> queue=new LinkedList<Integer>();
	
	queue.add(i);
	Boolean[] visited=new Boolean[4];
	visited[0]=false;
	visited[1]=false;
	visited[2]=false;
	visited[3]=false;
	
	

	while(!queue.isEmpty())
	{
		int element=queue.poll();
		visited[element]=true;
		System.out.println("element: "+element);
		Iterator<Integer> listIterator=adj[element].listIterator();

		while(listIterator.hasNext())
		{
			int n=listIterator.next();
			if(!visited[n])
			{ queue.addLast(n);
			  visited[n]=true;
			}
			
		}
		
	}
		
	} 
}
