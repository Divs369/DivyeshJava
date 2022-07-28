/*
 *  Interface : 
 *  
 *  1) It is syntactically similar to a class, But it is not a class.
 *  
 *  2) Since it is not a class ,so you cannot create an object of interface.
 *  
 *  3) By Default all Method inside interface are abstract.
 *  
 *  4) So interface provides us Full Abstraction.
 *  
 *  5) One interface can extends another interface.
 *  
 *  6) One Class can implements more than one interface.
 *  
 *  7) It is compulsory to implement the methods of interface, whichever 
 *   the class is implementing that interface.
 *   
 *  8) Inheritance of interface is also possible. 
 * 
 */

package OOP;

interface ifs1 {

	void math1();

}

interface ifs2 extends ifs1 {

	void math2();

}

class ABC implements ifs1, ifs2 {

	void math4() {
		System.out.println("\nThis is a Method 4 of Class ABC");
	}

	public void math1() {
		System.out.println("Method 1 of Interface is Implemented");
	}

	public void math2() {
		System.out.println("Method 2 of Interface is Implemented");
	}

}

class XYZ implements ifs2 {

	public void math1() {
		System.out.println("\nMethod 1 Interface Implemented in Class XYZ");
	}

	public void math2() {
		System.out.println("Method 2 Interface Implemented in Class XYZ");
	}

}

public class InterfaceDemo {
	public static void main(String[] args) {

		ABC a = new ABC();
		a.math1();
		a.math2();
		a.math4();

		XYZ b = new XYZ();
		b.math1();
		b.math2();

	}

}
