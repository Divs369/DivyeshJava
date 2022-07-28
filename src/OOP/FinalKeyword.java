/*
 * final -> It is a keyword.
 * 
 * 1) final keyword can be given to class,method and variable.
 * 
 * 2) If variable is declared final, then we cannot change its value.
 * 		It is compulsory to assign.
 * 
 * 3) if method is declared as final then we cannot override the method.
 * 
 * 4) if we declare class as final then we cannot Inherit the class.
 *  
 */

package OOP;

class final1 {
	final int a = 10;

	void show() {
		// a = 25; if use final keyword then we can't change value after assign once
		System.out.println("A = " + a);
	}
}

class final2 extends final1 {
	int b = 20;

	void show() {
		super.show();
		System.out.println("B = " + b);
	}
}

public class FinalKeyword {
	public static void main(String[] args) {
		final2 f = new final2();
		f.show();
	}

}
