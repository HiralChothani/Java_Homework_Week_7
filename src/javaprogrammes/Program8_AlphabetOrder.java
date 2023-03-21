package javaprogrammes;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */

import java.util.Scanner;

public class Program8_AlphabetOrder {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Input alphabet :");
        char ch = scanner.next().charAt(0);
        if (ch == 'A') {
            System.out.println("City name is : Aberdeen");
        } else if (ch == 'B') {
            System.out.println("City name is : Bradford");
        } else if (ch == 'C') {
            System.out.println("City name is : Cambridge");
        } else if (ch == 'D') {
            System.out.println("City name is : Derby");
        } else if (ch == 'E') {
            System.out.println("City name is : Exeter");
        } else if (ch == 'F') {
            System.out.println("City name is : Failsworth");
        } else {
            System.out.println("Invalid Entry");
        }

        scanner.close();

    }
}
