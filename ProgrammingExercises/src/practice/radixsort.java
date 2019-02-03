package practice;


import java.util.*;
import java.lang.*;
import java.io.*;

class radixsort {
	public static void main (String[] args) {

       Scanner reader = new Scanner(System.in);
	    int numberOfTestCases = reader.nextInt();
        
        for(int i=0;i<numberOfTestCases;i++)
        {
           int temp[]=new int[3];
           int arrSize=reader.nextInt();
           for(int j=0;j<arrSize;j++)
           {
        	   int a=reader.nextInt();
        	   temp[a]++;
           }
           
           for(int k=0;k<3;k++)
           {
        	   for(int p=0;p<temp[k];p++)
        		   System.out.println(k+" ");
           }
           
        }



	}
}
