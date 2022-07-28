package OOP;

class Method {

	public int getA(int a, int b) {
		return a + b;
	}
}

class Method1 {

	public int getA(int a, int b, int c) {
		return a + b + c;
	}
}

public class MethodOverloading {
	public static void main(String[] args) {

		Method1 m = new Method1();
		System.out.println("Sum = " + m.getA(10, 20, 30));
	}

}
