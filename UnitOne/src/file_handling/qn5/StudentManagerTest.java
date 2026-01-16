package file_handling.qn5;

import java.util.Scanner;

public class StudentManagerTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentManager manager = new StudentManager("student_data.dat");

		while (true) {
			System.out.println("\n1. Add  2. View  3. Update  4. Exit");
			int choice = sc.nextInt();

			if (choice == 1) {
				System.out.print("ID: ");
				int id = sc.nextInt();
				System.out.print("Name: ");
				String name = sc.next();
				System.out.print("Marks: ");
				int marks = sc.nextInt();
				manager.addStudent(new Student(id, name, marks));
			} else if (choice == 2) {
				manager.readAll();
			} else if (choice == 3) {
				System.out.print("ID to update: ");
				int id = sc.nextInt();
				System.out.print("New Marks: ");
				int marks = sc.nextInt();
				manager.updateMarks(id, marks);
			} else {
				break;
			}
		}
		sc.close();
	}
}
