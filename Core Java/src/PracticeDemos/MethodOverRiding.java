package PracticeDemos;

class Bank { // Parent Class

	int getRateOfInterest() {
		return 0;
	}
}

class SBI extends Bank { // Child Class

	int getRateOfInterest() {
		return 7;
	}
}

class ICICI extends Bank { // Child Class

	int getRateOfInterest() {
		return 8;
	}
}

class AXIS extends Bank { // Child Class

	int getRateOfInterest() {
		return 9;
	}
}

public class MethodOverRiding {
	public static void main(String[] args) {

		SBI s = new SBI();
		ICICI i = new ICICI();
		AXIS a = new AXIS();

		System.out.println("SBI Rate Of Interest : " + s.getRateOfInterest());
		System.out.println("ICICI Rate Of Interest : " + i.getRateOfInterest());
		System.out.println("AXIS Rate Of Interest : " + a.getRateOfInterest());
	}

}
