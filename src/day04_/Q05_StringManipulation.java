package day04_;

import java.util.Scanner;

public class Q05_StringManipulation {
    //Kullanicidan ismini ve soyisimi girmesini isteyin, sonrasinda konsola tam ismini buyuk harfler ile yazdirin
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Ismınızı gırınız");
        String isim = scan.nextLine();
        System.out.println("Soyısmınızı gırınız");
        String soyisim = scan.nextLine();

        System.out.println("Ismınz buyuk harf : " + isim.toUpperCase());


    }

}







