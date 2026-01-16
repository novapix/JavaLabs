package file_handling.qn3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileStatistics {
	public static void main(String[] args) {
        String filename = "data.txt";
        int wordCount = 0;
        int lineCount = 0;
        int charCount = 0;

        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                lineCount++;
                charCount += line.length();
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }

            System.out.printf("Total number of lines: %d%n", lineCount);
            System.out.printf("Total number of words: %d%n", wordCount);
            System.out.printf("Total number of characters: %d%n", charCount);

        } catch (FileNotFoundException e) {
            System.err.printf("Error: The file '%s' was not found.%n", filename);
        }
    }
}
