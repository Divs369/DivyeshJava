
//0-1 Triangle Pattern

import java.util.Scanner;

public class PrintPattern6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = 5;

		// outer loop
		for (int i = 1; i <= n; i++) {
			// inner loop
			for (int j = 1; j <= i; j++) {
				int sum = i + j;
				if (sum % 2 == 0) { // Even
					System.out.print(" 1 ");
				} else { // Odd
					System.out.print(" 0 ");
				}
			}
			System.out.println();
		}
	}

}
