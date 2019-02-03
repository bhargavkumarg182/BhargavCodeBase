package practice;

public class fibanocci {
public static void main(String[] args) {
	
	int firstNum=0,secondNum=1;
	
int count=0,sum=0;
	while(count<8)
	{
		sum=firstNum+secondNum;
		firstNum=secondNum;
		secondNum=sum;
		count++;
	}
	
	
	System.out.println(sum);
}
}
