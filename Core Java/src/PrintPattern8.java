import java.util.Scanner;

// Solid Rhombus Pattern 

public class PrintPattern8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = 5;

		for (int i = 1; i <= n; i++) {
			// spaces
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}

			// stars
			for (int k = 1; k <= 5; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
