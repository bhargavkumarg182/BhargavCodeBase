package threadexamples;

public class extendthreadDriver {

	public static void main(String[] args) {
		
		extendthread e1=new extendthread();
		extendthread2 e2=new extendthread2();

		e1.start();
		e2.start();
		
	}
	
}
