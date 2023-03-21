package javaprogrammes;
/**
 * WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
 * salary
 * HRA = basic salary 10%
 * DA = Basic salary 8%
 * TA = Basic salary 9%
 * PF= Basic salary 20%
 * Gross salary = basic salary + HRA + TA + DA –PF
 * Print in given format
 */

import java.util.Scanner;

public class Program5_SalarySlip {
    public static void main(String[] args) {
        int id;
        String name;
        double salary;

        // use scanner to input employee id, name, basic salary
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter employee id :");
        id = scanner.nextInt();

        System.out.println("Enter employee name :");
        name = scanner.next();

        System.out.println("Enter basic salary :");
        salary = scanner.nextDouble();

        //create object to call instance method
        Program5_SalarySlip obj = new Program5_SalarySlip();
        obj.salarySlip(salary, id, name);

        scanner.close();
    }

    public void salarySlip(double salary, int id, String name) { // instance method

        //HRA = basic salary 10%
        double hra = 10 / 100.0 * salary;

        //DA = Basic salary 8%
        double da = 8 / 100.0 * salary;

        // TA = Basic salary 9%
        double ta = 9 / 100.0 * salary;

        // PF= Basic salary 20%
        double pf = 20 / 100.0 * salary;

        // Gross salary = basic salary + HRA + TA + DA –PF
        double gs = salary + hra + da + ta - pf;

        //  print out format
        System.out.println("-------------------------------------");
        System.out.println("|            Salary Slip             |");
        System.out.println("|____________________________________|");
        System.out.println("|Employee ID      :    " + id + "          |");
        System.out.println("|Employee Name    :    " + name + "           |");
        System.out.println("|____________________________________|");
        System.out.println("|Basic Salary     :    " + salary + "       |");
        System.out.println("|HRA  10%         :    " + hra + "        |");
        System.out.println("|TA  8%           :    " + ta + "        |");
        System.out.println("|DA  9%           :    " + da + "        |");
        System.out.println("|PF - 20%          :    " + pf + "       |");
        System.out.println("|____________________________________|");
        System.out.println("|Gross Salary     :    " + gs + "       |");
        System.out.println("|====================================|");


    }
}
