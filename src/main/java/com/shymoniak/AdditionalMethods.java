package com.shymoniak;

import java.util.ArrayList;

/**
 * This class contains arithmetical methods and methods, which are
 * used to make console interface
 */
public class AdditionalMethods {

    /**
     * Returns the biggest odd number from ArrayList given
     *
     * @param arrayList
     * @return odd number
     */
    public static int maxOddNumber(ArrayList<Integer> arrayList) {
        int result = -1;
        for (int i = 0; i < arrayList.size(); i++) {
            if ((arrayList.get(i) > result) && (!(isEven(arrayList.get(i))))){
                result = arrayList.get(i);
            }
        }
        return result;
    }

    /**
     * Returns the biggest even number from ArrayList given
     *
     * @param arrayList
     * @return even number
     */
    public static int maxEvenNumber(ArrayList<Integer> arrayList) {
        int result = -1;
        for (int i = 0; i < arrayList.size(); i++) {
            if ((arrayList.get(i) > result) && (isEven(arrayList.get(i)))){
                result = arrayList.get(i);
            }
        }
        return result;
    }

    /**
     * Indicates whether number is odd or even
     *
     * @param number
     * @return {boolean} true if number is even and false if it is odd
     */
    public static boolean isEven(final int number) {
        return number % 2 == 0;
    }

    /**
     * Prints the menu of the program, which has all the possible operations
     * enumerated
     */
    public static void printMenu() {
        System.out.println("_________________________________________________________________");
        System.out.println("|\t Choose an operation\t\t\t\t\t\t\t\t\t\t|");
        System.out.println("|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|");
        System.out.println("|\t  Operations list:\t\t\t\t\t\t\t\t\t\t\t|\n" +
                "|\t1. Print Fibonacci sequence\t\t\t\t\t\t\t\t\t|\n" +
                "|\t2. Print Fibonacci sequence within interval\t\t\t\t\t|\n" +
                "|\t3. Print the biggest odd Fibonacci number from interval\t\t|\n" +
                "|\t4. Print the biggest even Fibonacci number from interval\t|\n" +
                "|\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\n" +
                "|\t9. Exit\t\t\t\t\t\t\t\t\t\t\t\t\t\t|");
        System.out.println("_________________________________________________________________");
    }

    /**
     * Prints ArrayList in the console in a convenient way
     * @param arrayList
     */
    public static void printArrayList(ArrayList<Integer> arrayList){
        for (int i = 0; i < arrayList.size(); i++){
            System.out.printf("[" + arrayList.get(i) + "], ");
        }
        System.out.println();
    }
}
