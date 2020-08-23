package com.company;

public class StringMethods {
    public static void main(String[] args) {

        String name = "Java";
        System.out.println(name.equals("Java"));
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(3));
        //    System.out.println(name.charAt(4));//StringIndexOutOfBoundsException
        //runtime exception
        String language = " english";
        System.out.println(name.contains("k"));//false
        System.out.println(name.concat(" language"));//Java language
        System.out.println(name.concat(language));//Java english
        System.out.println(name.equalsIgnoreCase("java"));//boolean
        System.out.println(name.endsWith("a"));//boolean verir
        System.out.println(name.indexOf("v"));//v nin indexini verir
        System.out.println(name.isEmpty());//false verir cunku stringin ici dolu
        System.out.println(name.length());//4 kac karakterli oldugunu verir
        System.out.println(name.replace("a", "*"));//J*v*
        System.out.println(name.replaceAll("Ja", "selenyum"));
        System.out.println(name.replaceFirst("a", "new"));//birden fazla karakter varsa ilk karakteri degistirir
        System.out.println(name.toLowerCase());//java
        System.out.println(name.toUpperCase());//JAVA
        System.out.println(name.startsWith("a"));//javamiz a ilemi basliyor false
        System.out.println(name.substring(1, 3));//1.indexi dahil eder 3. indexi almaz
        System.out.println(name.split("v"));
    }
}
