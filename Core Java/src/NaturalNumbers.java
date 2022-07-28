//Print N natural Numbers.

import java.util.Scanner;

public class NaturalNumbers {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int n = sc.nextInt();
		
		int sum = 0;
		
		for(int i=1; i<=n; i++) {
			sum = sum + i;
		}
		System.out.println("Sum = "+sum);
	}

}
