import java.util.Scanner;

public class PrintPattern2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = 5;

		// outer loop
		for (int i = 1; i <= n; i++) {
			// inner loop
			for (int j = 1; j <= i; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}

		System.out.println("\nReverse The Above Pattern\n");

		// outer loop
		for (int i = n; i >= 1; i--) {
			// inner loop
			for (int j = 1; j <= i; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}

}
