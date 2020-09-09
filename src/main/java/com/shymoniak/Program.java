/*
 * Copyright (c) Andriy Shymoniak
 */

package com.shymoniak;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * The class <p>Program</p> is a main class for a program, which prints
 * Fibonacci numbers
 *
 * @author Andriy Shymoniak
 * @version 1.0
 * @since 01.04.2019
 */
public class Program {

    public static void main(String[] args) {
        //provides user with console interface
        consoleInterface();
    }

    /**
     * This method shows programs menu and allows user to choose function he
     * wants to.
     * Due to have the ability to use this program more than once, it is not
     * located directly in the main method (program will not finish working until
     * user enters exit "button", so that he can use it multiple times without
     * constantly rerunning the whole program).
     */
    public static void consoleInterface() {

        AdditionalMethods additionalMethods = new AdditionalMethods();
        FibonacciMethods fibonacciMethods = new FibonacciMethods();

        //prints the menu of the program in console
        additionalMethods.printMenu();

        Scanner scan = new Scanner(System.in);
        int fromUser = scan.nextInt();

        //indicates which method to call depending on users choice
        switch (fromUser) {
            case 1:
                System.out.println("Print the amount of Fibonacci numbers you want to see");
                fromUser = scan.nextInt();
                System.out.println(fibonacciMethods.makeFibonacciSequence(fromUser));

                consoleInterface();
                break;

            case 2:
                System.out.println("Print the lower and the upper bounds of the interval");
                int lower = scan.nextInt();
                int upper = scan.nextInt();
                ArrayList<Integer> integerArrayList = fibonacciMethods.getFibonacciFromInterval(lower, upper);
                additionalMethods.printArrayList(integerArrayList);

                consoleInterface();
                break;

            case 3:
                System.out.println("Print the lower and the upper bounds of the interval");
                lower = scan.nextInt();
                upper = scan.nextInt();
                integerArrayList = fibonacciMethods.getFibonacciFromInterval(lower, upper);
                System.out.println("The biggest odd Fibonacci number from interval [" + lower +
                        ", " + upper + "] is " + additionalMethods.maxOddNumber(integerArrayList));

                consoleInterface();
                break;

            case 4:
                System.out.println("Print the lower and the upper bounds of the interval");
                lower = scan.nextInt();
                upper = scan.nextInt();
                integerArrayList = fibonacciMethods.getFibonacciFromInterval(lower, upper);
                System.out.println("The biggest even Fibonacci number from interval [" + lower +
                        ", " + upper + "] is " + additionalMethods.maxEvenNumber(integerArrayList));

                consoleInterface();
                break;

            case 9:
                return;

            default:
                System.out.println();
                break;
        }

    }


}
