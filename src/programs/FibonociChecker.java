package programs;

import java.util.Scanner;

public class FibonociChecker {
	 // Method to check if a number is in the Fibonacci series
	int number=21;
    public static boolean isFibonacci(int num) {
        int first = 0, second = 1;
        
        // If the number is 0 or 1, it is part of the Fibonacci series
        if (num == 0 || num == 1) {
            return true;
        }

        // Generate Fibonacci series and check if the number is in the series
        while (second < num) {
            int next = first + second;
            first = second;
            second = next;
        }

        // If we have found the number, it is in the series
        return second == num;
    }

    public static void main(String[] args) {
        // Read the number to check
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it is in the Fibonacci series: ");
        int number = scanner.nextInt();
System.out.println(number);
        // Check if the number is in the Fibonacci series
        if (isFibonacci(number)) {
            System.out.println(number + " is a Fibonacci number.");
        } else {
            System.out.println(number + " is NOT a Fibonacci number.");
        }

        scanner.close();
    }
}