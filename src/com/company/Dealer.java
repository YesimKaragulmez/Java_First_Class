package com.company;

import java.util.Scanner;

public class Dealer {
    //hangi araba istediginizi soracaksaniz ve sonrasinda bizde hangi
    // arabalar oldugunu soyleyeceksiniz german american japanese,
    // bizde 3 araba var. verilen cevaba gore her araba icin kisinin
    // butcesini soracaksaniz alman icin 5000 uzerindeyse alabilir,
    // american icin 8000uzerindeyse alabilir japanese icin 4000
    // uzerindeyse alabilir. Eger bunlarin hicbiri degilse elimizde
    // size uyan araba yok diyebilirsiniz
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Which country car ?");
        System.out.println("we have german,american ,japanese");
        String country = input.nextLine();

        if (country.equalsIgnoreCase("german")) {
            System.out.println("you choose german ");

            System.out.println("what is your budget");
            double amount = input.nextDouble();
            if (amount >= 5000) {
                System.out.println("you can buy german car");
            } else {
                System.out.println("your budget is not enough");
            }

        } else if (country.equalsIgnoreCase("american")) {
            System.out.println("you choose american ");

            System.out.println("what is your budget");
            double amount = input.nextDouble();
            if (amount >= 8000) {
                System.out.println("you can buy german car");
            } else {
                System.out.println("your budget is not enough");
            }
        } else if (country.equalsIgnoreCase("japanese")) {
            System.out.println("you choose japanese ");

            System.out.println("what is your budget");
            double amount = input.nextDouble();
            if (amount >= 4000) {
                System.out.println("you can buy german car");
            } else {
                System.out.println("your budget is not enough");
            }
        } else {
            System.out.println("you did not choose our car");
        }


    }
}
