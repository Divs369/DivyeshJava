import java.util.Scanner;

public class ArrayDemo {
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
	}

}
