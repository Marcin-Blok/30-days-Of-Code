package pl.marcinblok.car;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayPractice {

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void printArray(String[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {

        // Declaring, Allocating, Initializing
        int[] array1;
        int[] array2 = new int[4];
        int[] array3 = {5, 2, 9, 1, 3};
        String[] shoppingList = {"Bananas", "Apples", "Pears", "Strawberries"};

        // Assigning values
        array2[0] = 10;
        array2[1] = 8;
        array2[2] = 5;
        array2[3] = 10;

        // Printing out arrays
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));
        System.out.println();

        // Custom print out arrays
        printArray(array2);
        printArray(shoppingList);

        // Retrieve objects
        System.out.println(array2[3]);
        System.out.println(Array.get(array2, 3));
        System.out.println();

        // Given functions
        Arrays.sort(array3);
        printArray(array3);


        System.out.println("Special for loop:");
        for (String element : shoppingList) {
            System.out.println(element);
        }
    }
}
