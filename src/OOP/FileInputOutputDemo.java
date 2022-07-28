/*
 * .txt -> this file is Platform Independent.
 * 			i.e it works in all O.S
 * 
 * FileOutputStream -> To write a data into file.
 * FileInputStream - > To Read data from file.
 * 
 * getBytes: It will convert String byte by byte;
 * 
 */

package OOP;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputOutputDemo {
	public static void main(String[] args) throws Exception {

		FileOutputStream fos = new FileOutputStream("tops1.txt");

		String s = "This is FileInputOutputStream Example";
		byte[] b = s.getBytes();

		fos.write(b);
		fos.close();
		System.out.println("File Written Successful.");

		FileInputStream fis = new FileInputStream("tops1.txt");

		int i;
		while ((i = fis.read()) != -1) // -1 means End of File.
		{
			System.out.print((char) i);
		}
	}

}
