package OOP;

class Student {
	int rollNo;
	String name;

	Student() {
		System.out.println("Default Constructor Called");
	}

	Student(int rollNo) {
		this.rollNo = rollNo;
		System.out.println(this.rollNo);
	}

	Student(int rollNo, String name) {
		this();
		this.rollNo = rollNo;
		this.name = name;
		System.out.println("Enter Roll No : " + rollNo);
		System.out.println("Enter Name : " + name);
	}
}

public class ThisKeyword {
	public static void main(String[] args) {
		Student t = new Student(10, "Divyesh");
		new Student(13);
	}

}
