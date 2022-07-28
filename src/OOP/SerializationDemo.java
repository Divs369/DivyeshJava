/*
 *  Serialization : To write the current status of an object into the file 
 *  				is called Serialization.
 *  
 *  DeSerialization : To Read the current status of an object from the file
 *  				  is called Deserialization.
 *  
 *  
 *  If we are using serialization concept, then you need to compulsory implements serializable interface.
 * 
 * Serializable interface does not contain any methods.
 * 
 * Serialization provides Security.
 * 
 * Marker interface : An interface which does not contain any methods is called Marker interface.
 * 					 e.g Serializable 
 * 
 * toString() -> It belongs to the String Class.
 * 				It gets automatically called when the object is printed.
 * 
 * 
 */

package OOP;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable {

	int eid;
	String ename;
	double esalary;

	public Employee(int eid, String ename, double esalary) {
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}

	public String toString() {
		return "\nEid : " + eid + "\nEname : " + ename + "\nEsalary : " + esalary;
	}

}

public class SerializationDemo {
	public static void main(String[] args) throws Exception {

		Employee e = new Employee(101, "Divyesh", 30000);

		FileOutputStream fos = new FileOutputStream("ser.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(e);
		fos.flush();
		fos.close();

		System.out.println("File Written Successfully");

		FileInputStream fis = new FileInputStream("ser.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);

		Employee e1 = (Employee) ois.readObject();
		System.out.println(e1);

	}

}
