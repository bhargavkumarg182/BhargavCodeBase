package Tree;

import java.util.ArrayList;
import java.util.List;

public class solution {
	
	static int countSpecialElements(List<List<Integer>> matrix) {

        List<Integer> rowMinTracker=new ArrayList<Integer>();
        List<Integer> rowMaxTracker = new ArrayList<Integer>();
        List<Integer> colMinTracker = new ArrayList<Integer>();
        List<Integer> colMaxTracker = new ArrayList<Integer>();

        List<Integer> firstRow=matrix.get(0);
         int rowSize=firstRow.size();

         int colSize=matrix.size();
 
     

        for(int i=0;i<rowSize;i++)
        {
            int rowMin = 999999;
            int rowMax = -999999;
            int colMin = 999999;
            int colMax = -999999;
            for(int j=0;j<colSize;j++)
            {
             if(matrix.get(i).get(j)<rowMin)
               rowMin=matrix.get(i).get(j); 
             if(matrix.get(i).get(j)>rowMax)
               rowMax=matrix.get(i).get(j);   

               if(matrix.get(j).get(i)<colMin)
               rowMin=matrix.get(j).get(i); 
             if(matrix.get(j).get(i)>colMax)
               rowMax=matrix.get(j).get(i);   

            }
            rowMinTracker.add(rowMin);
            rowMaxTracker.add(rowMax);
            colMaxTracker.add(colMax);
            colMinTracker.add( colMin);

        }
        
        int minMaxCounter=0;

     
        for(int i=0;i<rowSize;i++)
        {
            for(int j=0;j<colSize;j++)
            {
               if((matrix.get(i).get(j)==rowMaxTracker.get(i))||(matrix.get(i).get(j)==rowMinTracker.get(i))||(matrix.get(i).get(j)==colMaxTracker.get(j))||                  (matrix.get(i).get(j)==rowMaxTracker.get(j)))
                     minMaxCounter++;


            }
        
        }   

        return minMaxCounter;


	}




    
public static void main(String[] args) {
	
	List<List<Integer>> matrix=new ArrayList<List<Integer>> ();
	
	List<Integer> test=new ArrayList<Integer>();
	List<Integer> test2=new ArrayList<Integer>();
	List<Integer> test3=new ArrayList<Integer>();

	test.add(1);
	
	test.add(3);
	
	
	
test2.add(5);
	
	test2.add(2);
	
	
test3.add(8);
	
	test3.add(7);
	
	matrix.add(test);
	matrix.add(test2);
	matrix.add(test3);
	System.out.println(matrix.size());
	
}

}
