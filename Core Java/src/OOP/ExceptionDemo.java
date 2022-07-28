/*
 * What is an Exception ?
 * 
 * -> An exception is an abnormal situation that arises during 
 *    the Run-time of a program.
 * 
 *  It will terminate the program there itself where 
 *  the exception is generated.
 *  
 *  E.g. If there 100 lines of code, and exception is raised at
 *       line 9, it will not execute the next line i.e. line 8.
 *       
 *  In java there are two types of Exceptions.
 *  1) Checked Exception : This exception is handled at Compile
 *                         time. 
 *                         
 *  2) Unchecked Exception : This exception is handled at Run time.
 *  
 *  In Java to handle Exception there are 5 Keywords used.
 *  
 *     1) try
 *     2) catch
 *     3) finally
 *     4) throw
 *     5) throws
 *     
 *   1) try : It is a keyword.
 *            try block will never be alone.
 *            It will compulsory have catch/finally block.
 *              
 */

package OOP;

import java.util.Scanner;

public class ExceptionDemo {
	public static void main(String[] args) {

		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Start the code");

		try {
			System.out.print("Enter A : ");
			a = sc.nextInt();
			System.out.print("Enter B : ");
			b = sc.nextInt();
			System.out.println("A = " + a + "\nB = " + b);
			c = a / b;
			System.out.println("Division C = " + c);

			int a1[] = { 10, 20, 30 };
			System.out.println(a1[2]);

			System.out.println("End the code");
		}

		catch (Exception e) {
			System.out.println("Exception Caught" + e);
		}

	}

}
