import java.util.Scanner;

//Palindromic Pattern

public class PrintPattern10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = 5;

		for (int i = 1; i <= n; i++) {
			// spaces
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}

			// 1st Half Numbers
			for (int k = i; k >= 1; k--) {
				System.out.print(k);
			}

			// 2nd Half Numbers
			for (int l = 2; l <= i; l++) {
				System.out.print(l);
			}
			System.out.println();
		}
	}

}
