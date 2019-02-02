
/*package whatever //do not write package name here */
package practice;
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
    Scanner reader = new Scanner(System.in);
    int numberOfTestCases=reader.nextInt();
    
    while(numberOfTestCases>0)
    {
      int arraySize=reader.nextInt();
      int maxSum=0,currentMax;
      int[] input=new int[arraySize];
      
      for(int i=0;i<arraySize;i++)
      {
       input[i]=reader.nextInt();   
      }
        currentMax=0;
        maxSum=input[0];
      for(int j=0;j<arraySize;j++)
      {
          currentMax=Integer.max(input[j],currentMax+input[j]);
          if(maxSum<currentMax)
            maxSum=currentMax;
          
      }
    System.out.println(maxSum)    ;
        
    }
    

	}
}