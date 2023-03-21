package javaprogrammes;

import java.util.Scanner;

/**
 * . Write a java program input sales id, seller's name, sales amount, and salary basic and
 * then fined this sales Commission
 * Sales amount >= 50,000 35%
 * Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */
public class Program7_SalesCommission {

    double commissionRate;

    public static void main(String[] args) {
        int id;
        String name;
        double amount;
        double bs;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sales ID :");
        id = scanner.nextInt();

        System.out.println("Enter seller's name :");
        name = scanner.next();

        System.out.println("Enter sales amount :");
        amount = scanner.nextDouble();

        System.out.println("Enter basic salary :");
        bs = scanner.nextDouble();

        // call instance method
        Program7_SalesCommission obj = new Program7_SalesCommission();
        obj.findSalesCommission(amount);

        scanner.close();
    }

    // instance method
    public void findSalesCommission(double amount) {

        double commission;

        // if-else to find commission amount

        if (amount >= 50000) {
            commission = 35 / 100.0 * amount;
        } else if (amount >= 30000) {
            commission = 20 / 100.0 * amount;
        } else if (amount >= 20000) {
            commission = 10 / 100.0 * amount;
        } else if (amount >= 10000) {
            commission = 5 / 100.0 * amount;
        } else {
            commission = 2 / 100.0 * amount;
        }

        System.out.println("Sales commission is : " + commission);

        // if-else to find commission rate

        if (amount >= 50000) {
            System.out.println("Commission rate is : 0.35");
        } else if (amount >= 30000) {
            System.out.println("Commission rate is : 0.20");
        } else if (amount >= 20000) {
            System.out.println("Commission rate is : 0.10");
        } else if (amount >= 10000) {
            System.out.println("Commission rate is : 0.05");
        } else {
            System.out.println("Commission rate is : 0.02");
        }
    }


}
