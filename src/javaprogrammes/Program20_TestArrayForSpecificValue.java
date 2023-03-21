package javaprogrammes;

import java.util.Arrays;

public class Program20_TestArrayForSpecificValue {

    public static void main(String[] args) {

        // create array string
        String[] vowels = {"A", "I", "E", "O", "U"};

        System.out.println("Unsorted Array = " + Arrays.toString(vowels));

        Arrays.parallelSort(vowels);

        System.out.println("Sorted Array = " + Arrays.toString(vowels));

        int index = Arrays.binarySearch(vowels, "X");

        if (index < 0) {
            System.out.println("X not found in the array");
        } else {
            System.out.println("X found in the array");
        }

        // ---------------------Or --------------------

        String[] vowels2 = { "A", "I", "E", "O", "U" };

// using simple iteration over the array elements
        for (String s : vowels2) {
            if ("E".equals(s)) {
                System.out.println("E found in the vowels list.");
            }
        }
    }
}
