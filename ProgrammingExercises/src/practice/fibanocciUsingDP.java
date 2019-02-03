package practice;

public class fibanocciUsingDP {

	public static void main(String[] args) {
		
		int n=10;
		int result=getFibonacci(n);
		System.out.println(result);

	}

	private static int getFibonacci(int n) {

	  int[] fib=new int[n];
	  
	  fib[0]=0;
	  fib[1]=1;
		
	  for(int iter=2;iter<n;iter++)
	  {
		  fib[iter]=fib[iter-1]+fib[iter-2];
	  }
	return fib[n-1];
	  
	}
}
