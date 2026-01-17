package arrays.qn3;

import java.util.Scanner;

public class JaggedArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] jagged = new int[3][];
		jagged[0] = new int[2];
		jagged[1] = new int[3];
		jagged[2] = new int[4];

		System.out.println("Enter elements for the jagged array:");
		for (int i = 0; i < jagged.length; i++) {
			System.out.println("Enter " + jagged[i].length + " elements for row " + (i + 1) + ":");
			for (int j = 0; j < jagged[i].length; j++) {
				jagged[i][j] = sc.nextInt();
			}
		}

		System.out.println("\nJagged Array:");
		for (int i = 0; i < jagged.length; i++) {
			for (int j = 0; j < jagged[i].length; j++) {
				System.out.print(jagged[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("\nSum of each row:");
		for (int i = 0; i < jagged.length; i++) {
			int sum = 0;
			for (int j = 0; j < jagged[i].length; j++) {
				sum += jagged[i][j];
			}
			System.out.println("Row " + (i + 1) + ": " + sum);
		}

		sc.close();
	}
}
