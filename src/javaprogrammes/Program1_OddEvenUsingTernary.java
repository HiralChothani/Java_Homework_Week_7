package javaprogrammes;

import java.util.Scanner;

/**
 * Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator
 */
public class Program1_OddEvenUsingTernary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = scanner.nextInt();

        // ternary operator to check number is even or odd

        String result = number % 2 == 0 ? "Even" : "Odd";

        System.out.println(number + " is " + result);

        scanner.close();

    }


}
