package arrays.qn2;

import java.util.Scanner;

public class MatrixOperations {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] matrix = new int[3][3];

		System.out.println("Enter elements of 3x3 matrix:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		System.out.println("\nMatrix:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println("\nSum of each row:");
		for (int i = 0; i < 3; i++) {
			int rowSum = 0;
			for (int j = 0; j < 3; j++) {
				rowSum += matrix[i][j];
			}
			System.out.println("Row " + (i + 1) + ": " + rowSum);
		}

		System.out.println("\nSum of each column:");
		for (int j = 0; j < 3; j++) {
			int colSum = 0;
			for (int i = 0; i < 3; i++) {
				colSum += matrix[i][j];
			}
			System.out.println("Column " + (j + 1) + ": " + colSum);
		}

		sc.close();
	}
}