import java.util.Scanner;

public class sample {
	
	 static void getVal() {
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A : ");
		a = sc.nextInt();
		System.out.println("A = "+ a);
	}
	
	public static void main(String[] args) {
		sample s1 = new sample();
		getVal();
	}
}
