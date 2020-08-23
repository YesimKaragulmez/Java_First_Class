package com.company;

import java.util.Scanner;

public class calculatorwithswitch {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num1;
        int num2;
        String operator;
        int result = 0;
        System.out.println("first result: " + result);

        System.out.println("please enter first  number");
        num1 = scan.nextInt();

        System.out.println("please enter second  number");
        num2 = scan.nextInt();

        System.out.println("please enter the operator");
        operator = scan.next();
        switch (operator) {
            case "+":
                result = num1 + num2;
                System.out.println(result);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;

            case "/":
                System.out.println(num1 / num2);
                break;


        }

    }
}