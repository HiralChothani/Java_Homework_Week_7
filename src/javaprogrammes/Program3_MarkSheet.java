package javaprogrammes;

import java.util.Scanner;

public class Program3_MarkSheet {


    public static void main(String[] args) {

        int eng, math, sci, roll, total, percentage;
        String name;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student name : ");
        name = scanner.nextLine();

        System.out.println("Enter roll number :");
        roll = scanner.nextInt();

        System.out.println("Enter Maths mark:");
        math = scanner.nextInt();

        System.out.println("Enter Science mark:");
        sci = scanner.nextInt();

        System.out.println("Enter English mark:");
        eng = scanner.nextInt();

        // check if marks are valid (between 0 and 100)
        if (math < 0 || math > 100 ||
                sci < 0 || sci > 100 || eng < 0 || eng > 100) {
            System.out.println("Invalid input, marks should be between 0 and 100");
            return; // to stop going further if marks entered by user out of range
        }

        // call static method
        total(math, sci, eng, roll, name);

        scanner.close();
    }

    public static void total(int math, int sci, int eng, int roll, String name) {
        int total = math + sci + eng;

        double percentage = total / 300.0 * 100.0;

        //if-else condition
        String r = "";
        if (percentage >= 35) {
            r = "Pass";
        } else {
            r = "Fail";
        }


        // Nestled if-else condition for grade
        String g = "";
        if (percentage >= 80)
            g = "A+";
        else if (percentage < 80 && percentage >= 60) // marks < 80 && marks >=70
            g = "A";
        else if (percentage < 60 && percentage >= 50)
            g = "B+";
        else if (percentage < 50 && percentage >= 35)
            g = "B";
        else
            g = "C";

        // Mark sheet printout
        System.out.println(" ________________________________");
        System.out.println("|                                |");
        System.out.println("|            Mark Sheet          |");
        System.out.println("|________________________________|");
        System.out.println("|       Name     :       " + name + "     |");
        System.out.println("|     Roll No    :        " + roll + "      |");
        System.out.println("|________________________________|");
        System.out.println("|    Subjects    :    Marks      |");
        System.out.println("|________________________________|");
        System.out.println("|    Maths       :    " + math + "         |");
        System.out.println("|    Science     :    " + sci + "         |");
        System.out.println("|    English     :    " + eng + "         |");
        System.out.println("|________________________________|");
        System.out.println("|      Total     :    " + total + "        |");
        System.out.println("|________________________________|");
        System.out.println("|    Percentage  :     " + percentage + "      |");
        System.out.println("|    Result       :    " + r + "      |");
        System.out.println("|    Grade        :    " + g + "        |");
        System.out.println("|________________________________|");

    }


}
