package OOP;

import java.util.Scanner;

class InsufficientFunds extends Exception {

	double amount;

	public InsufficientFunds(double amount) {
		this.amount = amount;
	}

	public double getAmt() {
		return this.amount;
	}
}

class CheckingAccount {
	long accno;
	double balance = 0;

	public CheckingAccount(long accno) {
		this.accno = accno;
		System.out.print("Account No : " + this.accno);
	}

	public void deposit(double amount) {
		this.balance = this.balance + amount;
	}

	public void withdraw(double amount) throws InsufficientFunds {
		if (amount <= this.balance) {
			this.balance = this.balance - amount;
		} else {
			double needs = amount - this.balance;
			throw new InsufficientFunds(needs);
		}

	}

	public void CheckBalance() {
		System.out.print("\nCurrent Balance : " + this.balance);
	}

}

public class BankDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		CheckingAccount ca = new CheckingAccount(358678966);
		ca.CheckBalance();

		double amt;
		System.out.print("\nEnter Amount to Deposit : ");
		amt = sc.nextDouble();
		ca.deposit(amt);
		ca.CheckBalance();
		
		try {
			System.out.print("\nEnter Amount to Withdraw : ");
			amt = sc.nextDouble();
			ca.withdraw(amt);
			System.out.println("\nWithdrwal is Successful");
			ca.CheckBalance();
		} catch (InsufficientFunds e) {
			// TODO Auto-generated catch block
			System.out.println("\nYou Need Rs" + e.getAmt() + " more to withdraw");
		}

	}

}
