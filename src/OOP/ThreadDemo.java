/*
 *  Thread : Thread is a smallest individual unit of your program
 *  		 is called Thread.
 *  		Thread execute's  one after another.
 *  		It execute's one thread at Time.
 * 
 * Java provides you the InBuilt Thread Class.
 * 
 * Thread contains 3 arguments
 * 
 * Thread[main,5,main]
 * 
 * 1st argument -> It is the Thread Name.
 * 					By Default Java provides you the main Thread.
 * 
 * 2nd argument -> It is Thread Priority.
 * 				  By Default the Thread Priority is 5. Norm_priority
 * 
 * Priority is divided into 3 parts.
 * 
 * Min_priority -> Value 1
 * Norm_priority -> Value is 5
 * Max_priority -> Value is 10
 * 
 * 3rd Argument -> It is Group Name.
 * 				  By Default Java provides you the Main Group.
 * 
 */
package OOP;

public class ThreadDemo {
	public static void main(String[] args) {

		Thread t = Thread.currentThread();
		System.out.println(t);
		t.setName("TopsThread");
		System.out.println("After Name Change : " + t);
		t.setPriority(11);
		System.out.println("After Priority Change : " + t);
	}

}
