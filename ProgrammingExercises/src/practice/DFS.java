package practice;

import java.util.Iterator;
import java.util.LinkedList;

public class DFS {
	 private int V;   // No. of vertices 
	  
	    // Array  of lists for Adjacency List Representation 
	    private LinkedList<Integer> adj[]; 
	  
	    // Constructor 
	    DFS(int v) 
	    { 
	        V = v; 
	        adj = new LinkedList[v]; 
	        for (int i=0; i<v; ++i) 
	            adj[i] = new LinkedList(); 
	    } 
	  
	    //Function to add an edge into the graph 
	    void addEdge(int v, int w) 
	    { 
	        adj[v].add(w);  // Add w to v's list. 
	    } 
	    void DFS(int v) 
	    { 
	        boolean visited[] = new boolean[V]; 
	  
	        DFSUtil(v, visited); 
	    } 
	    
	    
	    private void DFSUtil(int v2, boolean[] visited) {

	    	LinkedList<Integer> li=adj[v2];
	    	System.out.println(v2);
	    	visited[v2]=true;
	        Iterator<Integer> i = li.listIterator(); 

	        while(i.hasNext())
	        {
	           int n=i.next();
		    	if(!visited[n])
		    	{
		    	   	DFSUtil(n, visited);
		    	}
	        }
	        
	        
	    	
		}

		public static void main(String args[]) 
	    { 
	        DFS g = new DFS(4); 
	  
	        g.addEdge(0, 1); 
	        g.addEdge(0, 2); 
	        g.addEdge(1, 2); 
	        g.addEdge(2, 0); 
	        g.addEdge(2, 3); 
	        g.addEdge(3, 3); 
	  
	        System.out.println("Following is Depth First Traversal "+ 
	                           "(starting from vertex 2)"); 
	  
	        g.DFS(2); 
	    }
}
