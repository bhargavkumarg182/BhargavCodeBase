package practice;

public class RainWaterTrap {
public static void main(String[] args) {
	
	int arr[]={3,0,0,2,0,4};
	
	int arrSize=arr.length;	
	int diff=arr[arrSize-1]-arr[0];
    
    int min=arr[0];
	if(arr[0]<arr[arrSize-1])
	  min=arr[0];
	else
      min=arr[arrSize-1];
	
	int sumOfMiddleElements=0;
	
	for(int i=1;i<arrSize-1;i++)
	{
		sumOfMiddleElements=sumOfMiddleElements+arr[i];
	}
	
    int sum=((arrSize-2)*min)-sumOfMiddleElements;
    if(sum<0)
    	sum=0;
    System.out.println(sum);
	
 }
}
