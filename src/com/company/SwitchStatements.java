package com.company;

import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {

        String colors;//burada define ettik yani tanimladik
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter your colour");
        colors = scan.nextLine();//burda deger veriyoruz

        switch (colors) {
            case "red":
                System.out.println("red is choosen");
                break;
            case "pink":
                System.out.println("pink is choosen");
                break;
            default:
                System.out.println("default colour is white");
        }


    }
}
