package javaprogrammes;
/**
 * Write a java program to input any number and find out if it’s odd or even
 */

import java.util.Scanner;

public class Program6_OddOrEven {
    public static void main(String[] args) {

        int number; // local variable

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number :");
        number = scanner.nextInt();

        // object creation to call instance method
        Program6_OddOrEven obj = new Program6_OddOrEven();
        obj.oddOrEven(number);

        scanner.close();
    }

    public void oddOrEven(int number) { // no return with parameter instance method
        //condition to check odd / even
        if (number % 2 == 0) {
            System.out.println(number + " is even number");
        } else {
            System.out.println(number + " is odd number");
        }

    }
}

