package Tree;

import java.util.ArrayList;
import java.util.List;

public class solution2 {

	
	public static void main(String[] args) {
		
		
        List<Integer> colMaxTracker = new ArrayList<Integer>();

        colMaxTracker.add(1);
        colMaxTracker.add(2);
        colMaxTracker.add(3);
        String s="";
       s= s.concat(Integer.toString(colMaxTracker.get(0)));
        s.concat(Integer.toString(colMaxTracker.get(1)));
        s.concat(Integer.toString(colMaxTracker.get(2)));

        
    System.out.println(s);
	}
}
