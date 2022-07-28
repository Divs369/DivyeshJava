import java.util.Scanner;

public class PrintPattern7 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = 5;

		// Upper Half
		for (int i = 1; i <= n; i++) {
			// 1st Part
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			// Spaces
			int spaces = 2 * (n - i);
			for (int k = 1; k <= spaces; k++) {
				System.out.print(" ");
			}

			// 2nd Part
			for (int l = 1; l <= i; l++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// Lower Half
		for (int i = n; i >= 1; i--) {
			// 1st Part
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			// Spaces
			int spaces = 2 * (n - i);
			for (int k = 1; k <= spaces; k++) {
				System.out.print(" ");
			}

			// 2nd Part
			for (int l = 1; l <= i; l++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
