package com.company;

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        //scanner clasi kullanip kisinin yasi 18 den buyukse ve vatandassa oy
        //kullanabilir.  ama bu conditionun ikisini de karsilamiyorsa oy kullanamaz
        //int yas icin
        //boolean ->true false girmainz gerekiyor
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the age");
        int age = scan.nextInt();
        System.out.println("are you citizienship?");//cevap true ya da false olmasi lazim
        boolean citizien = scan.nextBoolean();

        if (age >= 18 && citizien == true) {
            System.out.println("you are eligible to vote");
        } else {
            System.out.println("you are not eligible to vote");
        }


    }
}
