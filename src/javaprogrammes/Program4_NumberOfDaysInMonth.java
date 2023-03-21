package javaprogrammes;

public class Program4_NumberOfDaysInMonth {

    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));

        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2020));
    }

    public static boolean isLeapYear(int year) {  // no return with parameter method

        // if-else to check parameter in range and return value accordingly
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {
                if (year % 100 != 0) {
                    if (year % 400 == 0) {
                        return true;
                    }
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    // with return type with parameter method.
    public static int getDaysInMonth(int month, int year) {

        String nameOfMonth;

        // condition to check month & year is in the range
        if (month < 1 || month > 12 || year < 1 || year > 9999)
            return -1;

        //switch statement to return number of days in month
        switch (month) {
            case 1:
                nameOfMonth = "January";
                return 31;

            case 2:
                nameOfMonth = "February";
                // condition to check if a year is leap year or not.
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    return 29;
                } else {
                    return 28;
                }

            case 3:
                nameOfMonth = "March";
                return 31;

            case 4:
                nameOfMonth = "April";
                return 30;

            case 5:
                nameOfMonth = "May";
                return 31;

            case 6:
                nameOfMonth = "June";
                return 30;

            case 7:
                nameOfMonth = "July";
                return 31;

            case 8:
                nameOfMonth = "August";
                return 31;

            case 9:
                nameOfMonth = "September";
                return 30;

            case 10:
                nameOfMonth = "October";
                return 31;

            case 11:
                nameOfMonth = "November";
                return 30;

            case 12:
                nameOfMonth = "December";
                return 31;
            default:
                return -1;
        }


    }

}
