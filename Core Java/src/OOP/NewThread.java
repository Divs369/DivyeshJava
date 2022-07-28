package OOP;

class MyThread extends Thread {

	public MyThread() {
		super("Child Thread");
		start();
	}

	public void run() {
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(this + " " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Child Thread Exiting");
	}
}

public class NewThread {
	public static void main(String[] args) {
		new MyThread();
	}

}
