package OOP;

import java.util.Scanner;

class A {
	int a;

	Scanner sc = new Scanner(System.in);

	void getA() {
		System.out.print("Enter A : ");
		a = sc.nextInt();
	}

	void showA() {
		System.out.println("A = " + a);
	}
}

class B extends A {
	int b;

	void getB() {
		System.out.print("Enter B : ");
		b = sc.nextInt();
	}

	void showB() {
		System.out.println("B = " + b);
	}
}

class C extends B {
	int c;

	void getC() {
		System.out.print("Enter C : ");
		c = sc.nextInt();
	}

	void showC() {
		System.out.println("C = " + c);
	}
}

public class MultiLevelInheritance {
	public static void main(String[] args) {

		C b = new C();
		b.getA();
		b.getB();
		b.getC();
		b.showA();
		b.showB();
		b.showC();
	}

}
