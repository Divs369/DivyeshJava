/*
 *  Thread Synchronization : It is a process of allowing a single thread to use the object ,when multiple
 *  						 threads trying to use that particular object at same time.
 *  
 *  					   : To avoid Thread interference Synchronization is used.
 *  
 *  					   : To avoid the dependency of Threads.
 *  						 i.e It will lock the next Thread, until the current thread is executed.
 *  
 * 						   : To achieve Synchronization java has provided a keyword called as "synchronized".
 *   					
 */

package OOP;

class Caller {

	public void call(String msg) {
		System.out.print("[" + msg);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("]");
	}
}

class Callback implements Runnable {

	Thread t;
	String tname;
	Caller c;

	public Callback(String tname, Caller c) {

		this.tname = tname;
		this.c = c;
		t = new Thread(this);
		t.start();
	}

	public void run() {
		synchronized (c) {
			c.call(tname);
		}
	}
}

public class SynchronizationDemo {
	public static void main(String[] args) {

		Caller c = new Caller();
		Callback c1 = new Callback("Hello", c);
		Callback c2 = new Callback("World", c);
		Callback c3 = new Callback("Synchronized", c);

	}

}
