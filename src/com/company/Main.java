package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello World");
//        System.out.println(" ");
//
//        //String ->inside quotation mark
//        String firstName = "Yesim";
//        String lastName="Kara";
//        System.out.println(firstName+" "+lastName);
//
//        int age=20;//tam sayilarda integer degiskenini kullaniyoruz
//        System.out.println("Ben "+age+" yasindayim.");
//
//        double price=5.6;//desimal sayilar icin
//
//        char letter='A';//sadece tek bir karakter icin kullan ama single quotation
//
//        boolean book=true;//true yada false icin gecerli
//        boolean phone=false;
//
//        //uncomman variables types
//       // byte,long,short,float,
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("please provide a number");
//        double price1=scanner.nextDouble();
//        System.out.println("price of product = " + price1);
        //if kosul saglaninca islemler yapiliyor
//        System.out.println("sonuc :" + (4 == 6));//false
//        System.out.println("sonuc :" + (4 != 6));//true
//        System.out.println("sonuc :" + (4 < 6));
//        System.out.println("sonuc :" + (4 > 6));
//        System.out.println("sonuc :" + (4 <= 6));
//
//        Scanner scan = new Scanner(System.in);
//        System.out.println("notunuzu girin");
//        int note = scan.nextInt();
//        if (note > 90) {
//            System.out.println("dersten gectiniz notunuz AA");
//        } else if (note > 85) {
//            System.out.println("dersten gectiniz notunuz BA");
//        } else if (note > 80) {
//            System.out.println("dersten gectiniz notunuz BB");
//
//        } else {
//            System.out.println("kaldiniz");
//        }
//        String sys_kul_adi = "yazilim bilimi";
//        String parola = "12345";
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("kullanici adi:");
//        String kullaniciAdi=scanner.nextLine();
//
//        System.out.println("parola:");
//        String kul_parola=scanner.nextLine();
//
//        if( !(sys_kul_adi.equals(kullaniciAdi)) && !(parola.equals(kul_parola))) {
//            System.out.println("kulanici adi ve parola yanlis");
//        }
//        else if( (sys_kul_adi.equals(kullaniciAdi)) && !(parola.equals(kul_parola))){
//            System.out.println("parola yanils");
//        }
//        else if( !(sys_kul_adi.equals(kullaniciAdi)) && !(parola.equals(kul_parola))){
//            System.out.println("kullaci adi yanlis");
//        }
//        else {
//            System.out.println("no problem");
//        }

//kullanicidan birden fazla input aliyorsak switch kullaniriz

        int bakiye = 1000;

        Scanner scan = new Scanner(System.in);
        System.out.println("1: bakiye goruntule");
        System.out.println("2: para yatirma");
        System.out.println("3: para cekme");
        System.out.println("4: sistemden cikis");
        int islem = scan.nextInt();

        switch (islem) {
            case 1:
                System.out.println("bakiyeniz: " + bakiye + " tl dir ");
                break;
            case 2:
                System.out.println("ne kadar yatiracaksiniz");
                int miktar = scan.nextInt();
                bakiye += miktar;
                System.out.println("bakiyeniz: " + bakiye + " tl dir ");
                break;
            case 3:
                System.out.println("ne kadar cekeceksiniz ");
                miktar = scan.nextInt();
                bakiye -= miktar;
                System.out.println("bakiyeniz: " + bakiye + " tl dir ");
                break;
            case 4:
                System.out.println("sistemden cikiliyor");
                break;

        }


    }
}
