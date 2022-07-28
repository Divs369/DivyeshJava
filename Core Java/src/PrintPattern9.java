import java.util.Scanner;

public class PrintPattern9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = 5;

		for (int i = 1; i <= n; i++) {
			// spaces
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}

			// Numbers -> Print row no, row no times
			for (int k = 1; k <= i; k++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

}
