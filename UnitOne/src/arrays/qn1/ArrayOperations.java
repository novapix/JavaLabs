package arrays.qn1;

import java.util.Scanner;

public class ArrayOperations {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];
		int sum = 0;

		System.out.println("Enter 5 integers:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Array elements:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}

		double average = (double) sum / arr.length;

		System.out.printf("%nSum : %d", sum);
		System.out.printf("%nAverage: %f", average);

		sc.close();
	}
}
