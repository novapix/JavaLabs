package exception_handling.qn1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Enter first integer: ");
			int a = sc.nextInt();

			System.out.print("Enter second integer: ");
			int b = sc.nextInt();

			float result =  a / b;
			System.out.println("Result: " + result);

		} catch (ArithmeticException e) {
			System.out.println("Error: Division by zero is not allowed.");

		} catch (InputMismatchException e) {
			System.out.println("Error: Please enter valid integer values.");

		} finally {
			System.out.println("Program execution completed.");
			sc.close();
		}
	}
}
