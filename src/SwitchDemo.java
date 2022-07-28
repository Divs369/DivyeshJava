import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		
		int choice;
		float a=10, b=77;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Addition \n2.Substraction \n3.Multiplication \n4.Division");
		System.out.println("\nEnter Your Choice : ");
		choice = sc.nextInt();
		
		switch(choice)
		{
		case 1 : System.out.println("Addition is : "+(a +b ));
		         break;
		case 2 : System.out.println("Substraction is : "+(a - b));
                 break;
		case 3 : System.out.println("Multiplication is : "+(a * b));
                 break;
		case 4 : System.out.println("Division is : "+(a / b));
                 break;
        default : 
        	     System.out.println("Invalid Input");
        }
		
	}
}
