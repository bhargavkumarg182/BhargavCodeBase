package practice;


import java.util.*;
import java.lang.*;
import java.io.*;

class subarraysum {
    
    static void subarraySum(int[] arr,int n,int sum){
        int curr_sum = 0;
        int start = 0;
        
        for(int i=0;i<n;i++){
            curr_sum += arr[i];
            
            while(curr_sum > sum){
                curr_sum -= arr[start];
                start++;
            }
            
            if(curr_sum == sum){
                System.out.println((start+1)+" "+(i+1));
                return;
            }
        }
        
        System.out.println(-1);
    }
    
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();scanner.nextLine();
		
		for(int k=0;k<t;k++){
		    String str1 = scanner.nextLine();
		    String[] tokens1 = str1.split(" ");
		    int n = Integer.parseInt(tokens1[0]);
		    int sum = Integer.parseInt(tokens1[1]);
		    
		    String str2 = scanner.nextLine();
		    String[] tokens2 = str2.split(" ");
		    int[] arr = new int[n];
		    
		    for(int i=0;i<n;i++){
		        arr[i] = Integer.parseInt(tokens2[i]);
		    }
		    
		    subarraySum(arr,n,sum);
		}
	}
}