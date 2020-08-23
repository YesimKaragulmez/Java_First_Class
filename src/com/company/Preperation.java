package com.company;

import java.util.Scanner;

public class Preperation {

    public static void main(String[] args) {
        // IF ELSE STATEMENT
        // condition boolean vermek zorunda
//        if(condition1) {
//            eger condition1 true ise ne yapmak istiyorsunuz acikla
//        } else if (condition2) {
//            eger condition2 true ise ne yapmak istiyorsunuz acikla
//
//        } else {
//            yukardaki iki conditionda dogru degilse burada tanimlanani yap
//        }
//
//  int time=19;
//  if(time>20){
//      System.out.println("good night");
//  } else if(time<20){
//      System.out.println("good afternoon");
//  } else {
//      System.out.println("good evening, it is dinner time");
//
//  }

//        Scanner scan=new Scanner(System.in);
//        System.out.println("please enter the time");
//        int time=scan.nextInt();
//        if(time<19 && time>12 ){
//            System.out.println("good afternoon");
//        } else if(time>19){
//            System.out.println("good night");
//        } else {
//            System.out.println("good morning");
//        }
//
//
//    }
//
//      String operator;
//      String name="Java";
//      String otherName="Javascript";
//        System.out.println(name.equals(otherName));
//        System.out.println(name.equals("java"));

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter first  number");
        int first = scan.nextInt();
        System.out.println("please enter second  number");
        int second = scan.nextInt();
        System.out.println("please enter the operator");
        String operator = scan.nextLine();
        operator = "+";


    }


}
