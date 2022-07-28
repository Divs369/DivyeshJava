package PracticeDemos;

class Person {

	int eid;
	String name;

	Person(int eid, String name) {
		this.eid = eid;
		this.name = name;
	}

}

class Employee extends Person {

	float salary;

	Employee(int eid, String name, float salary) {
		super(eid, name); // Reusing Parent Constructor
		this.salary = salary;
	}

	void display() {
		System.out.println(eid + " " + name + " " + salary);
	}

}

public class SuperKeyword {
	public static void main(String[] args) {

		Employee e = new Employee(101, "Ravi", 45000f);
		e.display();
	}

}
