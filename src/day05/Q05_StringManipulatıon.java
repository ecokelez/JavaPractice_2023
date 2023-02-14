package day05;

import java.util.Scanner;

public class Q05_StringManipulatıon {
    public static void main(String[] args) {
        /*
         * Kullanicidan 4 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
         *
         * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
         *         Output : Cesaret insana sinirlarini ogretir.
         *
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Bırncı cumleyı gırın");
        String str1= scan.next().toLowerCase();
        System.out.println("Ikncı  cumleyı gırın");
        String str2= scan.next();
        System.out.println(" Ucuncu cumleyı gırın ");
        String str3= scan.next();
        System.out.println("Dorduncu cumleyı gırın");
        String str4= scan.next();
        System.out.println(str1.substring(0,1).toUpperCase()+str1.substring(1)+" "+ str2+"" + str3+" " + str4+".");




    }
}
