package threadexamples;

public class extendthread extends Thread {

	public void run() {
		int n = 5;
		while (n > 0) {
			System.out.println("n value " + n);
			n--;
		}
	}

}
