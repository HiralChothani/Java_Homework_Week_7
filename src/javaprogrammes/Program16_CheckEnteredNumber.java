package javaprogrammes;

/**
 * 16. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”
 */

import java.util.Scanner;

public class Program16_CheckEnteredNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = scanner.nextInt();

        // if -else statement to check if a number is positive, negative or zero
        if (num < 0) {
            System.out.println(num + " is a Negative number.");
        } else if (num > 0) {
            System.out.println(num + " is a positive number. ");
        } else {
            System.out.println(num + " is ZERO");

        }

        scanner.close();
    }
}