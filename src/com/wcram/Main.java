package com.wcram;

import java.util.Scanner;

public class Main {

    // Make scanner global
    static Scanner scanner = new Scanner(System.in); // Creates the scanner

    public static void main(String[] args) {

        Menu();
//        DoMath();
    } // main

    public static void Menu() {
        // Menu
        // 1 - Print Numbers
        // 2 - Do Math
        // 3 - Exit
        // println goes to next line

        // Flag variable to keep track if something is running
        boolean isRunning = true;

        do {
            System.out.println("Welcome to our menu");
            System.out.println("1 - Print Numbers");
            System.out.println("2 - Do Math");
            System.out.println("3 - Exit");
            // print() stays on the same line
            System.out.print("Please enter a selection: ");

            // Need to have this line to ask the user for their input

            String userInput = scanner.nextLine(); // Asks the user for their input

            // switch, case, break , default
            switch(userInput) {
                case "1" :
                    // Ask the user for 2 numbers
                    // Print from one number to another
                    System.out.println("You want to print numbers.");
                    PrintNumbers();
                    break;
                case "2" :
                    System.out.println("You want to do some math.");
                    DoMath();
                    break;
                case "3" : // Exit case
                    System.out.println("You want to exit the app.");
                    isRunning = false;
                    break;
                default : // Default is like the else block, it will run if nothing is runs
                    System.out.println("Please choose a valid choice.");
                    break;

            } // End of switch
        } while(isRunning); // Condition that will let you exit your code


    } // Menu

    public static void PrintNumbers() {
        // Ask the user for a start and end number
        System.out.print("Please enter your first number: ");
        int start = scanner.nextInt();

        scanner.nextLine(); // Clears the scanner

        System.out.print("Please enter you next number: ");
        int end = scanner.nextInt();

        for (int i = start; i < end; i++) {
            System.out.println(i);
        }
    } // PrintNumbers

    public static void DoMath() {
        System.out.print("Please enter your first number: ");
        double number1 = scanner.nextDouble();

        scanner.nextLine();

        System.out.print("Please enter your second number: ");
        double number2 = scanner.nextDouble();

        double sum = number1 + number2;
        // number1 + number2 = sum
        String formattedResult = String.format("%s + %s = %s\n", number1, number2, sum);
        System.out.printf(formattedResult);

    }

    public static void ForLoopExamples() {
        // Loops
        // for
//        for(int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }
        // For loop shortcut in Intelli is fori + tab
//
//        for (int i = 0; i < 30; i++) {
//            System.out.println(i);
//        }

        // Arrays
        boolean[] numbers = new boolean[10];
        // type[] = new type[size of array];

        // Difference between c# and java, fields are lower
        // case
        for (int i = 0; i < numbers.length; i++) {

            boolean currentNumber = numbers[i];
            String formattedString = String.format("%s : %s\n", i, currentNumber);
            // \n is the new line escape character
            // C# - String.Format("Name = {0}, hours = {1:hh}", name, DateTime.Now);
            // Java - String.Format("%s : %s\n", i, currentNumber);
            System.out.printf(formattedString);
        }

        // for each
        // Arrays with values on initialized
        String[] names = new String[] { "Zack", "Bander", "Soren", "Tony", "Will" };

        // For each is written slightly different
        // C# foreach(String name in names) {}
        // Java foreach(String name : names) {}
        for (String name:
                names) {
            System.out.println(name);
        }

    }

    public static void WhileDoWhileExample() {
        // for
        // foreach
        // while
        // do / while

        // while (condition) { while the condition is true, this code runs }

        int start = 0;
        int end = 10;

        // A while loop works like in c#
//        while(start < end) {
//            System.out.println(start);
//            start++;
//        }

        // What is the difference between a while and a do / while
        // 1 different between do while and while

        boolean isFalse = false;

        // The while loop CHECKS THE CONDITION FIRST, then runs
        while(isFalse) {
            System.out.println("The while loop ran");
        }

        // The do while loop CHECKS THE CONDITION AFTER running the first time
        // A do while will always run once
        do {
            System.out.println("The do while loop ran");
        } while(isFalse);
    }

    public static void IfStatementExample() {
        // Conditions
        // if, else if, else
        // switch

        // bool - true / false
        // Conditional Operators : ==, !=, <, >, <=, >=
        // Logical Operators : &&, ||, !

        System.out.println("Talking about Conditions");

        // you have to spell out boolean
        boolean isTrue = false;
        boolean isFiveGreaterThanSeven = 5 > 7;

        // Our decision structure ( if , else if , else )
        // works like in C#
        if(isFiveGreaterThanSeven) {
            System.out.println("The statement was true, the if block ran");
        }
        else if(isTrue) {
            System.out.println("The else if was true, the else if block ran");
        }
        else {
            System.out.println("The statement was false, the else block ran");
        }

    } // End of IfStatementExample()

} // class
