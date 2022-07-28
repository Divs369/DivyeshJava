package OOP;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReaderDemo {
	public static void main(String[] args) throws IOException {

		FileWriter fr = new FileWriter("tops2.txt");

		String s = "This is FileWriterReader Example";

		fr.write(s);
		fr.flush();
		fr.close();
		System.out.println("File Written Successful.");

		FileReader fw = new FileReader("tops2.txt");

		int i;
		while ((i = fw.read()) != -1) // -1 means End of File.
		{
			System.out.print((char) i);
		}

	}

}
