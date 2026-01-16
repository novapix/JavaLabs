package exception_handling.qn2;

import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50};

        try {
            System.out.print("Enter array index: ");
            int index = sc.nextInt();

            // for  NullPointerException
            // arr = null;

            System.out.println("Value at index: " + arr[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of range.");

        } catch (NullPointerException e) {
            System.out.println("Error: Array reference is null.");

        } finally {
            System.out.println("Execution completed.");
            sc.close();
        }
    }
}
