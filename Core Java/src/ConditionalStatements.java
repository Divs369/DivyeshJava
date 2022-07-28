import java.util.Scanner;

public class ConditionalStatements {
	public static void main(String[] args) {
		
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A: ");
		a = sc.nextInt();
		System.out.print("Enter B: ");
		b = sc.nextInt();
		System.out.print("Enter C: ");
		c = sc.nextInt();
		System.out.println("A = "+ a + "\tB = "+ b + "\tC = "+ c);
		
		if(a > b) {
			if(a > c) {
				System.out.println("A is Greater");
			}
			else {
				System.out.println("C is Greater");
			}
		}
		else {
			if(b > c) {
				System.out.println("B is Greater");	
			}
			else {
				System.out.println("C is Greater");
			}
				
		}
		
	}

}
