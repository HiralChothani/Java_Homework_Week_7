package javaprogrammes;

import java.util.Scanner;

/**
 * Write a java program to input any two number and ask user to enter their symbol l (+, -, /, *)
 * find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */
public class Program10_InputNumberAndSymbol {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // taking input from the user using the Scanner class
        System.out.print("Enter the first and the Second number : ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // selecting the operand for the calculations
        System.out.print("Choose and Enter the type of operation you want to perform (+, -, *, /) : ");
        char op = scanner.next().charAt(0);

        // call method
        solve(a, b, op);

        scanner.close();

    }

    public static void solve(int a, int b, char op) {

        int ans = 0;

        if (op == '+') {
            //  ans = a + b;
            System.out.println("Addition of " + a + " and " + b + " = " + (a + b));
        } else if (op == '-') {
            System.out.println("Subtraction of " + a + " and " + b + " = " + (a - b));
        } else if (op == '*') {
            System.out.println("Multiplication of " + a + " and " + b + " = " + (a * b));
        } else if (op == '/') {
            System.out.println("Division of " + a + " and " + b + " = " + (a / b));
        }

    }

}
