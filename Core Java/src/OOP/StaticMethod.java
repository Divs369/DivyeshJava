package OOP;

public class StaticMethod {

	static int a = 10;
	static int b;

	static void meth(int x) {
		System.out.println("X = " + x);
		System.out.println("A = " + a);
		System.out.println("B = " + b);
	}

	{
		// Normal Block called only If we create object
		System.out.println("Normal Block Called");
	}

	static {
		System.out.println("Static Block Called First");
		b = a * 5;
	}

	public static void main(String[] args) {
		StaticMethod s = new StaticMethod();
		meth(5);
	}

}
