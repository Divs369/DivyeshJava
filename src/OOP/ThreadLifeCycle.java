package OOP;
/*
 * There are 2 ways to create a CustomThread
 * 
 * 1) Extending the Thread Class
 * 2) Implementing the Runnable Thread
 * 
 */

class FirstThread extends Thread {

	public void run() { // Running
		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println("My First Thread Start " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("\nMy First Thread Completed");
	}
}

public class ThreadLifeCycle {
	public static void main(String[] args) {

		FirstThread ft = new FirstThread(); // Newborn Thread
		ft.setName("MyFirstThread");
		ft.setPriority(Thread.NORM_PRIORITY);
		System.out.println(ft);
		ft.start(); // Runnable Thread
		// ft.run();

		for (int i = 1; i < 5; i++) {
			System.out.println("My Main Thread is " + i);
		}
		System.out.println("\nMy Main Thread Is Completed\n");

	}

}
