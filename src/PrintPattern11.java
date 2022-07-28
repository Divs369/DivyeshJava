import java.util.Scanner;

public class PrintPattern11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = 4;

		// Upper Half
		for (int i = 1; i <= n; i++) {
			// spaces
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}

			// stars
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// Lower Half
		for (int i = n; i >= 1; i--) {
			// spaces
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}

			// stars
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
