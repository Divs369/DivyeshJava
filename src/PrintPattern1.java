import java.util.Scanner;

public class PrintPattern1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = 4;
		int m = 5;

		// outer loop
		for (int i = 1; i <= n; i++) {
			// inner loop
			for (int j = 1; j <= m; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		
		System.out.println("\n");

		// outer loop
		for (int i = 1; i <= n; i++) {
			// inner loop
			for (int j = 1; j <= m; j++) {
				if (i == 1 || j == 1 || i == n || j == m) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}

}
