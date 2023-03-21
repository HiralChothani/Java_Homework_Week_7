package javaprogrammes;
/**
 * Write a program that tells us input value is a number or an alphabet or a symbol.
 */

import java.util.Scanner;

public class Program12_Recognition {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value :");
        char input = scanner.next().charAt(0);

        // if-else statement to check input is alphabet/number/special character
        if (input >= 'a' && input <= 'z' || input >= 'A' && input <= 'Z') {
            System.out.println(input + " is an alphabet.");
        } else if (input >= '0' && input <= '9') {
            System.out.println(input + " is a number.");
        } else {
            System.out.println(input + " is a special character.");
        }

        scanner.close();

    }
}
