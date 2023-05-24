package com.wcram;

public class Main {

    public static void main(String[] args) {

        // Menu
        // 1 - Print Numbers
        // 2 - Do Math
        // 3 - Exit
        // println goes to next line
        System.out.println("Welcome to our menu");
        System.out.println("1 - Print Numbers");
        System.out.println("2 - Do Math");
        System.out.println("3 - Exit");
        // print() stays on the same line
        System.out.print();


        // switch, case, break , default
        switch() {
            case "1" :
                System.out.println("You want to print numbers");
                break;
            case "2" :
                System.out.println("You want to do some math");
                break;
            case "3" :
                System.out.println("You want to exit the app");
                break;

        } // End of switch

        // Loops


    } // main

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
