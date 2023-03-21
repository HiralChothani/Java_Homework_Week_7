package javaprogrammes;

/**
 * Write a Java program to calculate the average value of array elements.
 */
public class Program19_AverageValueOfArray {

    // method for average elements in an array
    public static void arrayAverage() {

        //create an array
        int array[] = {2, 16, 21, 6, 8, 7};

        //getting length of an array
        int l = array.length;

        //initialize sum
        int sum = 0;

        // getting sum of array by using for loop
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        double average = sum / l;
        System.out.println("Average of Array :" + average);
    }

    public static void main(String[] args) {
        arrayAverage();
    }
}
