/*
 * Abstraction   :  It is Hiding the internal implementation and giving an external 
 * 					interface to access that feature.
 * 					e.g Fan
 * 
 * 1)  Abstract class contains abstract and non-abstract methods.
 * 2)  We cannot create an Object of Abstract Class.
 * 3)  It provides Partial Abstraction.
 * 4)  Abstract Methods contains only Declaration.It cannot have a body.		
 *  
 */

package OOP;

abstract class abs1 {

	public void meth1() {
		System.out.println("Non Abstract Method");
	}

	abstract public void meth2();

}

class abs2 extends abs1 {

	public void meth2() {
		System.out.println("Using Unimplemented method to Implement here");
	}

}

public class AbstarctDemo {
	public static void main(String[] args) {
		abs2 a = new abs2();
		a.meth1();
		a.meth2();
	}

}
