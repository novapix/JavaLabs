package file_handling.qn6;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class SerializeStudent {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ObjectOutputStream out = null;

		try {
			System.out.println("Enter Student Details: ");

			System.out.print("Enter Student ID: ");
			int id = scanner.nextInt();
			scanner.nextLine();

			System.out.print("Enter Student Name: ");
			String name = scanner.nextLine();

			System.out.print("Enter Marks: ");
			float marks = scanner.nextFloat();

			Student student = new Student(id, name, marks);

			FileOutputStream fileOut = new FileOutputStream("student.dat");

			out = new ObjectOutputStream(fileOut);

			out.writeObject(student);

			System.out.println("Success, Student object has been serialized to 'student.dat'");
		} catch (IOException e) {
			System.err.println("An IOException occurred during serialization.");
			e.printStackTrace();
		} finally {
			try {
				if (out != null) {
					out.close();
				}
				scanner.close();
			} catch (IOException e) {
				System.err.println("Error closing the stream.");
			}
		}
	}
}