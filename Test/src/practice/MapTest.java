package practice;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	
	public static void main(String[] args) {
		
		Map<Integer,Integer> test=new HashMap<Integer,Integer>();
		test.put(1, 3);
		test.put(2,4);
		MapTest mt=new MapTest();
		mt.manipulate(test);
		
		int arr[]=new int[3];
		
		int a=3;
		mt.addValue(a);
		System.out.println(a);
		for(int iter=0;iter<test.size();iter++)
			System.out.println(test.get(iter+1));
	}

	 private void addValue(int a) {
         a=a+2;		
	}

	void manipulate(Map<Integer, Integer> test) {
		
		test.put(1, 4);
		         
		
	}
}
