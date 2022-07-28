package OOP;

class MyNewThread implements Runnable {

	Thread t;
	String tname;

	public MyNewThread(String tname) {
		this.tname = tname;
		t = new Thread(this, this.tname);
		t.start();
	}

	public void run() {
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(t + " : " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("Child Thread Exiting");
	}

}

public class CustomThread {
	public static void main(String[] args) {

		new MyNewThread("One");
		new MyNewThread("Two");
		new MyNewThread("Three");

	}

}
