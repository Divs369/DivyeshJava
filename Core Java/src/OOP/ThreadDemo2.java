package OOP;

public class ThreadDemo2 {
	public static void main(String[] args) {
		Thread t = Thread.currentThread();

		System.out.println("Starting Static Thread");
		System.out.println(t);

		t.setName("StaticThread");
		// System.out.println("After Name Change : " + t);

		t.setPriority(Thread.MAX_PRIORITY);
		// System.out.println("After Priority Change: " + t);
		// System.out.println("Thread is Alive or not......" + t.isAlive());

		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(t + ": " + i);
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("\nExiting Static Thread");
	}

}
