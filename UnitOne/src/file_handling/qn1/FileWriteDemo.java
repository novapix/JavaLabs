package file_handling.qn1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter text to write to file: ");
		String userInput = scanner.nextLine();

		String fileName = "data.txt";

		try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
			writer.write(userInput);
			System.out.println("File '" + fileName + "' created and data written successfully.");
		} catch (IOException e) {
			System.out.println("An error occurred while writing to the file: " + e.getMessage());
		} finally {
			scanner.close();
		}
	}
}
