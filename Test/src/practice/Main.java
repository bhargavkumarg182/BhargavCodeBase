package practice;
public class Main {

	public static void main(String[] args)
	{
		
		int arr[]={3,4,5,6,8};
		System.out.println(Integer.max(1, 2));

		Main obj= new Main();
		int[] a={3,2};
		obj.manipulate(a);
		System.out.println(a);
		
	}

	private void manipulate(int[] a) {
		
		a[0]=a[0]+2;
		a[1]=a[1]+2;

	}

	private static int binarySearch(int[] arr, int l, int r, int x) {

		int middle=(l+r-1)/2;
		
		if(r>=1){
		if(arr[middle]==x)
			return 1;
		
		if(x>arr[middle])
			return binarySearch(arr, middle+1, r, x);
		else
			return binarySearch(arr, l, middle-1, x);
		}
		
		return -1;
	}

	private static int[] selectionSort(int[] arr) {
		int minIndex=0;
		for(int iter=0;iter<arr.length-1;iter++)
		{
			minIndex=iter;
			
			for(int jter=iter+1;jter<arr.length;jter++)
			{
				if(arr[jter]<arr[minIndex])
				{
					minIndex=jter;
					
				}
			}
			int tempVariable=arr[iter];
			arr[iter]=arr[minIndex];
			arr[minIndex]=tempVariable;
		}
		
		return arr;
	}

	static int[] bubbleSort(int arr[])
    {
      int arrSize=arr.length;
      
      for(int iter=0;iter<arrSize-1;iter++)
      {
    	  for(int jter=0;jter<arrSize-iter-1;jter++)
    	  {
    		  if(arr[jter]>arr[jter+1])
    		  {
    			  int tempVariable=arr[jter];
    			  arr[jter]=arr[jter+1];
    			  arr[jter+1]=tempVariable;
    		  }
    	  }
      }
		return arr;
    }	
	
}
