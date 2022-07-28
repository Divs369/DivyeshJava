package OOP;

public class StringDemo {
	public static void main(String[] args) {

		String s1 = new String("This is a Tops Technology");
		System.out.println("String Length is : " + s1.length());
		System.out.println("Original String is : " + s1);
		System.out.println("UpperCase : " + s1.toUpperCase());
		System.out.println("LowerCase : " + s1.toLowerCase());
		System.out.println("SubString is : " + s1.substring(3));
		System.out.println("SubString is : " + s1.substring(5, 11));

		if (s1.equals("This is a Tops Technology")) {
			System.out.println("Both are Equal");
		} else {
			System.out.println("Both are not Equal");
		}
	}

}
