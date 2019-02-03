package threadexamples;

public class usingrunnableinterface {

	public static void main(String[] args) {

		Thread t1 = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 5; i++)
					System.out.println("i value" + i);
			}
		}

		);
		t1.start();

		Thread t2 = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 5; i++)
					System.out.println("j value" + i);
			}
		});

		t2.start();
	}

}
