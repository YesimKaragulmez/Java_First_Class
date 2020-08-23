package com.company;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        //      String operator;
//      String name="Java";
//      String otherName="Javascript";
//        System.out.println(name.equals(otherName));
//        System.out.println(name.equals("java"));

        Scanner scan = new Scanner(System.in);
        double num1;
        double num2;
        String operator;
        double result = 0;
        System.out.println("first result: " + result);

        System.out.println("please enter first  number");
        num1 = scan.nextInt();

        System.out.println("please enter second  number");
        num2 = scan.nextInt();

        System.out.println("please enter the operator");
        operator = scan.next();

//     if(operator.equals("+")){
//         System.out.println("result is: "+(num1+num2));
//     } else if(operator.equals("-")){
//         System.out.println("result is: "+(num1-num2));
//     } else if(operator.equals("*")) {
//         System.out.println("result is: " + (num1 * num2));
//     } else if(operator.equals("/")) {
//         System.out.println("result is: " + (num1 / num2));
//
//     }else{
//         System.out.println("there is no such mathematical operators");
//     }
//        if (operator.equals("+")) {
//            result = num1 + num2;
//        } else if (operator.equals("-")) {
//            result = num1 - num2;
//        } else if (operator.equals("*")) {
//            result = num1 * num2;
//        } else if (operator.equals("/")) {
//            result = num1 / num2;
//        } else {
//            System.out.println("there is no such mathematical operators");
//        }
//        System.out.println("our result is:"+result);

        switch (operator) {
            case "+":
                System.out.println(num1 + num2);
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
            default:
                System.out.println("enter the valid operator");
        }


    }
}
