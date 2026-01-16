package file_handling.qn2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadDemo {
	public static void main(String[] args) {
		String fileName = "data.txt";

		try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
			String line;
			System.out.printf("Contents of '%s':%n", fileName);
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			System.out.println("An error occurred while reading the file: " + e.getMessage());
		}
	}
}
