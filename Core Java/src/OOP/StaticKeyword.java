/*
 * static : It is a keyword.
 * 
 *  1) It is used for Common Memory Allocation.
 *  2) It is generally declared to variable,method.
 *  3) Static methods are called by its class name/method.
 *     we do not need to create the object. 
 *  4) Static block are called before main method. 
 * 
 */
package OOP;

import java.util.Scanner;

public class StaticKeyword {

	static int a;

	void setA() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A : ");
		a = sc.nextInt();
	}

	void getA() {
		System.out.println("A = " + a);
	}

	public static void main(String[] args) {
		StaticKeyword s1 = new StaticKeyword();
		StaticKeyword s2 = new StaticKeyword();
		StaticKeyword s3 = new StaticKeyword();

		s1.setA();
		s2.setA();
		s3.setA();

		s1.getA();
		s2.getA();
		s3.getA();

	}

}
