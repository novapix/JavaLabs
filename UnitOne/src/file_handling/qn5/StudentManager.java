package file_handling.qn5;

import java.io.IOException;
import java.io.RandomAccessFile;

public class StudentManager {
	private String filename;
	private static final int NAME_SIZE = 20; // 20 chars for name

	public StudentManager(String filename) {
		this.filename = filename;
	}

	public void addStudent(Student s) {
		try (RandomAccessFile file = new RandomAccessFile(filename, "rw")) {
			file.seek(file.length());

			file.writeInt(s.id);

			StringBuffer sb = new StringBuffer(s.name);
			sb.setLength(NAME_SIZE);
			file.writeChars(sb.toString());

			file.writeInt(s.marks);
			System.out.println("Student added.");

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	public void readAll() {
		try (RandomAccessFile file = new RandomAccessFile(filename, "r")) {
			file.seek(0);
			System.out.println("\n--- Records ---");

			while (file.getFilePointer() < file.length()) {
				int id = file.readInt();

				// Read Name (20 chars)
				char[] nameChars = new char[NAME_SIZE];
				for (int i = 0; i < NAME_SIZE; i++)
					nameChars[i] = file.readChar();
				String name = new String(nameChars);

				int marks = file.readInt();

				System.out.println(new Student(id, name, marks));
			}

		} catch (IOException e) {
			System.out.println("Error reading file.");
		}
	}

	public void updateMarks(int targetId, int newMarks) {
		try (RandomAccessFile file = new RandomAccessFile(filename, "rw")) {
			boolean found = false;

			while (file.getFilePointer() < file.length()) {
				long currentPos = file.getFilePointer();

				int id = file.readInt();

				if (id == targetId) {
					file.skipBytes(NAME_SIZE * 2);
					file.writeInt(newMarks);
					System.out.println("Marks updated.");
					found = true;
					break;
				} else {

					file.skipBytes((NAME_SIZE * 2) + 4);
				}
			}
			if (!found)
				System.out.println("ID not found.");

		} catch (IOException e) {
			System.out.println("Error updating.");
		}
	}
}
