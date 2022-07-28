/*
 *  throw: It is a keyword.
 *  	   It is not a block of code like try/catch.try{}catch{}
 *  	    It is mainly used to throw explicit exception.
 *  							
 * Rule 1) throw is not a block.
 * Rule 2) throw works with object of that class.
 * Rule 3) You cannot write any statement after throw;
 * Rule 4) If exception is thrown , it will immediately look for catch block.
 * 
 */

package OOP;

import java.util.Scanner;

public class ThrowDemo {
	public static void demo() {
		int x;

		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter X : ");
			x = sc.nextInt();

			if (x > 0) {
				System.out.println("Square of X : " + x * x);
			} else {
				throw new Exception("\nPlease Enter Positive Value");
			}
		} catch (Exception e) {
			System.out.println("Exception Caught" + e);
			demo(); // Used Recursive Function
		}
	}

	public static void main(String[] args) {
		demo();
	}

}
