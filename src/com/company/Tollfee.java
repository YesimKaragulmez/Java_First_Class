package com.company;

import java.util.Scanner;

public class Tollfee {
    public static void main(String[] args) {
//switch statementla alakali elimizde 3 type arac var
        // 1 nunara car 2 nunara bus 3numara truck.
        // Cartype gore toll fee ucretlendirmesi oluyr 1icin 4 dolar, 2icin 7dolar, 3icin 15dolar
        //en son eger hicbirini karsilamiyorsa

        Scanner input = new Scanner(System.in);
        double fee;
        System.out.println("enter car type,1:car 2:bus 3:truck");
        int cartype = input.nextInt();
        switch (cartype) {
            case 1:
                fee = 4.00;
                System.out.println("car fee amount" + fee);
                break;
            case 2:
                fee = 7.00;
                System.out.println("car fee amount" + fee);
                break;
            case 3:
                fee = 15.00;
                System.out.println("car fee amount" + fee);
                break;
            default:
                System.out.println("wrong type");


        }
    }
}
