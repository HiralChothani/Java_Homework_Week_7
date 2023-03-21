package javaprogrammes;

import java.util.Arrays;

/**
 * Write a Java program to sort a numeric array and a string array.
 */
public class Program17_SortArrays {

    public static void main(String[] args) {
        // Numeric array
        int[] arrNum = {2,16,21,6,8,7,81,85,11};

        // Apply sort method to above array
        Arrays.sort(arrNum);

        // Printing array after sorting
        System.out.println("Sorted numeric array[] string : " + Arrays.toString(arrNum));

        // String Array
        String[] strArr = {"Name", "Mark", "RollNo", "Id"};

        //Apply sort method to above array
        Arrays.sort(strArr);

        //Printing array after sorting
        System.out.println("Sorted String array[] : " + Arrays.toString(strArr));


    }
}
