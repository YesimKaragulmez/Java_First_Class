package com.company;

import java.util.Scanner;

public class LoginValidator {
    public static void main(String[] args) {


        String validUsername = "newStudents";
        String validpassword = "123name";

        //scanner clasi kullanip username ve password girceksiniz
        //username validusername esitse ve passwordda valide estse login yap
        //eger bu kosullardan biri bossa username and password can not be blank


        Scanner scan = new Scanner(System.in);
        System.out.println("enter the username");
        String username = scan.next();
        System.out.println("enter the password");
        String password = scan.next();

        if (username.equalsIgnoreCase(validUsername) && password.equals(validpassword)) {
            System.out.println("Login");
        } else if (username.equalsIgnoreCase(validUsername) && !password.equals(validpassword)) {
            System.out.println("wrong password");
        } else if (username.isEmpty() || password.isEmpty()) {
            System.out.println("username and password can not be blank");
        } else if (!username.equalsIgnoreCase(validUsername) && password.equals(validpassword)) {
            System.out.println("wrong password or username");

        } else {
            System.out.println("our system has issue");
        }
    }
}