/*
 *  String are Immutable -cannot be modified.
 *  
 *  StringBuffer are Mutable - It can be modified.
 *  
 */

package OOP;

public class StringBufferDemo {
	public static void main(String[] args) {

		StringBuffer s1 = new StringBuffer("This is a Tops Technology");

		System.out.println("String Length : " + s1.length());
		System.out.println("Original String is : " + s1);

		s1.insert(6, "Hi");
		System.out.println("After Insert String Length is : " + s1.length());
		System.out.println("After Insert String is : " + s1);

		s1.append(" Divyesh Sathwara");
		System.out.println("After Append String Length is : " + s1.length());
		System.out.println("After Append String is : " + s1);

		s1.delete(6, 9);
		System.out.println("After Delete String Length is : " + s1.length());
		System.out.println("After Delete String is : " + s1);

		System.out.println("String Reverse : " + s1.reverse());

	}

}
