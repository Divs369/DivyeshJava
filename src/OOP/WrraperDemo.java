package OOP;

public class WrraperDemo {
	public static void main(String[] args) {

		Integer i1 = new Integer(10);
		System.out.println("AutoBoxing : " + i1);

		int a = 100;
		Integer i2 = new Integer(a);
		System.out.println("Boxing : " + i2);

		int z = i1.intValue();
		System.out.println("UnBoxing : " + z);

		String s = "789";
		int add = Integer.parseInt(s);
		System.out.println("UnBoxing : " + (add + i1));

		String s1 = i2.toString();
		s1 = "Tops";
		System.out.println("String : " + s1);

	}

}
