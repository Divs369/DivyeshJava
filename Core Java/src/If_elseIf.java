import java.util.Scanner;

public class If_elseIf {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter A & B : ");
		int a = sc.nextInt();
		int b = sc.nextInt();

		if (a == b) {
			System.out.println("Equal");
		} else if (a > b) {
			System.out.println("A is Greater");
		} else {
			System.out.println("B is Greater");
		}

	}

}
