package com.company;

import java.util.Scanner;

public class practise {

    public static void main(String[] args) {
        //bir ay girin
        //eger 12 1 2 season kis icecek tea
        //eger 3 4 5 season spring icecek coffee
        //eger 6 7 8 season yaz icecek iced coffee
        //eger 9 10 11 season fall sahlep

        Scanner input = new Scanner(System.in);
        System.out.println("enter the number of season");
        int month = input.nextInt();

        if (month == 12 || month == 1 || month == 2) {
            System.out.println("season is winter");
            System.out.println("drink is tea");

        } else if (month == 3 || month == 4 || month == 5) {
            System.out.println("season is spring");
            System.out.println("drink is coffee");

        } else if (month == 6 || month == 7 || month == 8) {
            System.out.println("season is summer");
            System.out.println("drink is iced coffee");


        } else if (month == 9 || month == 10 || month == 11) {
            System.out.println("season is fall");
            System.out.println("drink is sahlep");

        } else {
            System.out.println("you did not provide correct number for month");
        }


    }
}

