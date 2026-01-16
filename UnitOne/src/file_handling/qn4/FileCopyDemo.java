package file_handling.qn4;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.io.IOException;
import java.io.FileNotFoundException;

public class FileCopyDemo {
	public static void main(String[] args) {
		String sourceFile = "data.txt";
		String destFile = "copy.txt";

		try (BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
				BufferedWriter writer = new BufferedWriter(new FileWriter(destFile))) {

			String line;
			while ((line = reader.readLine()) != null) {
				writer.write(line);
				writer.newLine();
			}

			System.out.println("File copied successfully from " + sourceFile + " to " + destFile);

		} catch (FileNotFoundException e) {
			System.out.println("Source file not found: " + sourceFile);
		} catch (IOException e) {
			System.out.println("Error during file copy: " + e.getMessage());
		}
	}
}