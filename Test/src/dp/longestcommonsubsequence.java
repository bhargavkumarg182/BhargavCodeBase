package dp;

public class longestcommonsubsequence {

	
	
	public static void main(String[] args)  
    { 
        String X = "OldSite:GeeksforGeeks.org"; 
        String Y = "NewSite:GeeksQuiz.com"; 
  
        int m = X.length(); 
        int n = Y.length(); 
  
        System.out.println("Length of Longest Common Substring is "
                + LCSubStr(X.toCharArray(), Y.toCharArray(), m, n)); 
    }

	private static int LCSubStr(char[] charArray, char[] charArray2, int m,
			int n) {

		int result = 0;
        
		 int[][] lcstuff=new int[m+1][n+1];
		for(int r=0;r<=m;r++)
		{
			for(int c=0;c<=n;c++)
			{
				
				if(r==0||c==0)
				{
					lcstuff[r][c]=0;
				}
				else if(charArray[r]==charArray2[c])
				{
					lcstuff[r][c]=1+lcstuff[r-1][c-1]+1;
					result=Integer.max(result, lcstuff[r][c]);
				}
				else
					lcstuff[r][c]=0;

			}
				
		}
		
		return result;
	} 
}
