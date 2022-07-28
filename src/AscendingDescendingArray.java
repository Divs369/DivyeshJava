import java.util.Scanner;

public class AscendingDescendingArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int arrdemo[] = new int[5];

		System.out.println("Enter Arrays Elements: \n");

		for (int i = 0; i < arrdemo.length; i++) {
			System.out.print("Enter Element [" + (i + 1) + "] = ");
			arrdemo[i] = sc.nextInt();
		}
		System.out.println("\nPrint The Arrays: \n");

		for (int i = 0; i < arrdemo.length; i++) {
			System.out.println("Element [" + (i + 1) + "] = " + arrdemo[i]);
		}

		// Sorting in Ascending Order

		for (int i = 0; i < arrdemo.length; i++) {
			for (int j = i + 1; j < arrdemo.length; j++) {

				if (arrdemo[i] > arrdemo[j]) {
					int temp;
					temp = arrdemo[i];
					arrdemo[i] = arrdemo[j];
					arrdemo[j] = temp;
				}
			}
		}

		// Display in Ascending Order

		System.out.println("\nArray Elements in Ascending Order : ");

		for (int i = 0; i < arrdemo.length; i++) {
			System.out.println("Element [" + (i + 1) + "] = " + arrdemo[i]);
		}

		// Sorting in Descending Order

		for (int i = 0; i < arrdemo.length; i++) {
			for (int j = i + 1; j < arrdemo.length; j++) {

				if (arrdemo[i] < arrdemo[j]) {
					int temp;
					temp = arrdemo[i];
					arrdemo[i] = arrdemo[j];
					arrdemo[j] = temp;
				}
			}
		}

		// Display in Descending Order

		System.out.println("\nArray Elements in Descending Order : ");

		for (int i = 0; i < arrdemo.length; i++) {
			System.out.println("Element [" + (i + 1) + "] = " + arrdemo[i]);
		}

	}
}
