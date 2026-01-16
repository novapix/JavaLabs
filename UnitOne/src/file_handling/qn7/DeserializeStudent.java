package file_handling.qn7;

import file_handling.qn6.Student;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeStudent {
	public static void main(String[] args) {
		ObjectInputStream in = null;

		try {
			FileInputStream fileIn = new FileInputStream("student.dat");
			in = new ObjectInputStream(fileIn);

			Student student = (Student) in.readObject();

			System.out.println("--- Deserialization Successful ---");
			System.out.println("Student Details read from file:");
			System.out.println("ID:    " + student.getId());
			System.out.println("Name:  " + student.getName());
			System.out.println("Marks: " + student.getMarks());
		} catch (IOException e) {
			System.err.println("Error: An I/O error occurred (File not found or unreadable).");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {

			System.err.println("Error: Student class not found.");
			e.printStackTrace();
		} finally {
			try {
				if (in != null) {
					in.close();
				}
			} catch (IOException e) {
				System.err.println("Error closing the stream.");
			}
		}
	}
}
