package practice;

public class FibanocciWithRecursion {

	
	public static void main(String[] args) {
		
		int nthFibonacci=10;
		
		int result=getFibonacci(nthFibonacci-1);
		System.out.println(result);
		
	}

	private static int getFibonacci(int nthFibonacci) {

		if(nthFibonacci==0||nthFibonacci==1)
			return nthFibonacci;
		else
		   return getFibonacci(nthFibonacci-1)+getFibonacci(nthFibonacci-2);
		
		
		
		
	}
	
}
