package com.shymoniak;

import java.util.ArrayList;

/**
 * This class contains all the methods, which are associated with Fibonacci
 * numbers and perform actions on them.
 */
public class FibonacciMethods {

    /**
     * Generates ArrayList with size = quantity and fills it with Fibonacci
     * numbers
     *
     * @param quantity
     * @return ArrayList filled with Fibonacci numbers
     */
    public static ArrayList<Integer> makeFibonacciSequence(int quantity) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        result.add(0, 1);
        result.add(1, 1);

        int nextFibonacciNumber;
        for (int i = 2; i < quantity; i++) {
            nextFibonacciNumber = result.get(i - 2) + result.get(i - 1);
            result.add(nextFibonacciNumber);
        }

        return result;
    }

    /**
     * This method generates ArrayList of Fibonacci numbers from interval given
     *
     * @param from is a variable which shows the lower bound of interval
     * @param to is a variable which shows the upper bound of interval
     * @return ArrayList filled with Fibonacci numbers
     */
    public static ArrayList<Integer> getFibonacciFromInterval(int from, int to) {
        int prevNumber = 1;
        int currentNumber = 1;
        int nextNumber = prevNumber + currentNumber;
        ArrayList<Integer> result = new ArrayList<Integer>();

        while (nextNumber <= to){
            if (nextNumber >= from && nextNumber <= to){
                result.add(nextNumber);
            }
            prevNumber = currentNumber;
            currentNumber = nextNumber;
            nextNumber = prevNumber + currentNumber;
        }

        return result;
    }


}
