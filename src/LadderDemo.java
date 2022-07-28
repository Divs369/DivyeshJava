import java.util.Scanner;

public class LadderDemo {
	
	public static void main(String[] args) {
		
		int rollNo;
		String name;
		int s1,s2,s3,total;
		double per;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Roll No: ");
		rollNo = sc.nextInt();
		System.out.println("Enter Your Name: ");
		name = sc.next();
		System.out.println("Enter Physcis Marks: ");
		s1 = sc.nextInt();
		System.out.println("Enter Maths Marks: ");
		s2 = sc.nextInt();
		System.out.println("Enter Chemistry Marks: ");
		s3 = sc.nextInt();
		
		total = s1+s2+s3;
		System.out.println("Total Marks: "+total);
		
		per = total/3;
		System.out.println("Percentage: "+per);
		
		if(per > 80) {
			System.out.println("Distinction");
		}
		else if(per > 70) {
			System.out.println("First Class");
		}
		else if(per > 50) {
			System.out.println("First Class");
		}
		else if(per > 35) {
			System.out.println("First Class");
		}
		else {
			System.out.println("Fail");
		}
		
	}

}
