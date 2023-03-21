package javaprogrammes;

import java.util.Scanner;

/**
 * Same as program-8 using switch statement.
 */
public class Program9_CityNameBySwitch {

    public static void main(String[] args) {

        //use scanner to input alphabet
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter alphabet : ");
        char ch = scanner.next().charAt(0);


        // call instance method to static method by creating an object
        Program9_CityNameBySwitch obj = new Program9_CityNameBySwitch();
        obj.cityName(ch);

        scanner.close();
    }

    // instance method to write logic by using switch
    public void cityName(char ch) { // no return type with parameter

        switch (ch) {
            case 'A':
                System.out.println("City name is : Aberdeen");
                break;
            case 'B':
                System.out.println("City name is : Bradford");
                break;
            case 'C':
                System.out.println("City name is : Cambridge");
                break;
            case 'D':
                System.out.println("City name is : Derby");
                break;
            case 'E':
                System.out.println("City name is : Exeter");
                break;
            case 'F':
                System.out.println("City name is : Failsworth");
                break;
            default:
                System.out.println("Invalid Entry");
        }

    }

}
