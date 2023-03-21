package javaprogrammes;
/**
 * 2. Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 */

import java.util.Scanner;

public class Program2_LeapYear {
    public static void main(String[] args) {

        //scanner call to allow user to enter a year
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a year:");
        int year = scanner.nextInt();

        // call instance method
        Program2_LeapYear obj = new Program2_LeapYear();
        obj.leapYear(year);

        scanner.close();
    }

    public void leapYear(int year) {  // instance method
        boolean x = (year % 4) == 0;

        if (x) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }

    }


}
