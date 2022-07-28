/*
 * Constructor : It is a special member function whose task is to initialize the 
 * 				value to the object.
 * 
 * 	Features: It is same name as the Class Name
 * 			  No Return-Type
 * 
 * Imp: It is Invoked automatically on the creation of object.
 * 
 * Types of Constructor :
 * 
 * 1)  Default Constructor
 * 2)  Parameterized Constructor
 * 3)  Copy Constructor  : We pass object as an Argument

 *
 * When more than one constructor is defined in the class is called
 * Constructor overloading.
 * 
 */

package OOP;

class Box {

	public double width, depth, height;

	// Default Constructor
	Box() {
		System.out.println("Default Constructor Called");
		width = 5;
		height = 4;
		depth = 8;
	}

	// Parameterized Constructor
	Box(double w, double d, double h) {
		System.out.println("\nParameterized Constructor Called");

		width = w;
		depth = d;
		height = h;
	}

	// Copy Constructor
	Box(Box b) {
		System.out.println("\nCopy Constructor Called");
		width = b.width;
		height = b.height;
		depth = b.depth;
	}

	void display() {
		System.out.println("Volume is " + (width * height * depth));
	}

	public static void main(String[] args) {

		Box b1 = new Box();
		b1.display();

		Box b2 = new Box(5, 7, 8);
		b2.display();

		Box b3 = new Box(b2);
		b3.display();

	}
}
