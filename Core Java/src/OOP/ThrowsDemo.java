/*
 * throws : It is a keyword.
 *  		It is generally a Checked Exception.
 *  		throws handles multiple Exception.
 *  		throws works with the Method Signature 
 *  		If throws is used do not use try/catch
 *  		throws is an alternative of try/catch.
 *		throw works with object of that particular class, 
 *	    Whereas throws works with Class.	
 *  
 */

package OOP;

import java.util.Scanner;

public class ThrowsDemo {

	public static void demo() throws Exception {
		int x;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter X : ");
		x = sc.nextInt();

		if (x > 0) {
			System.out.println("Square of X : " + x * x);
		} else {
			throw new Exception("\nPlease Enter Positive Value");
		}

	}

	public static void main(String[] args) throws Exception {
		demo();
	}

}
