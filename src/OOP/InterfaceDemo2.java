package OOP;

interface intf1 {

	static void meth1() {
		System.out.println("Method having body in Interface using Static Keyword");
	}
}

class PQR implements intf1 {

	public void meth2() {
		System.out.println("Method 2 is PQR Class method ");
	}
}

public class InterfaceDemo2 {
	public static void main(String[] args) {
		intf1.meth1();
		PQR p = new PQR();
		p.meth2();
	}

}
