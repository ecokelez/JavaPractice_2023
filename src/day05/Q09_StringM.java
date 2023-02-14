package day05;

import java.util.Scanner;

public class Q09_StringM {
    public static void main(String[] args) {
        // Kullanicidan isim ve soyismini girmesini isteyin ve
        // hangisinin daha uzun oldugunu yazdirin.


        Scanner scan=new Scanner(System.in);
        System.out.println("Ismınızı ve soyısmınızı gırınız : \n ısım");
        String ısım= scan.next();
        System.out.println("soyısım");
        String soyısım=scan.next();

        if (ısım.length()>soyısım.length()){
            System.out.println("ısmınız soyısmınızden  buyuk");
        } else if (ısım.length()==soyısım.length()) {
            System.out.println("ısmınız ve soyısmınız esıt uznlukta");

        }else System.out.println("Soyısmınız ısmınızden buyuk");


    }
}
