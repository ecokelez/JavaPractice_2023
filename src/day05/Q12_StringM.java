package day05;

import java.util.Scanner;

public class Q12_StringM {
    public static void main(String[] args) {
            // Kullanıcıdan dört harfli bir elime isteyın ve
            // Girilen kelimeyı tersten yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen dort harfli bir kelıme yazınız");
        String kelime= scan.nextLine();


        /*
        String tersYazma=kelime.substring(3)+
                                kelime.substring(2,3)+
                                kelime.substring(1,2)+
                                kelime.substring(0,1);

        System.out.println(tersYazma);

                                */

        if (kelime.length()<=4){

            char bir=kelime.charAt(0);
            char iki=kelime.charAt(1);
            char uc=kelime.charAt(2);
            char dort=kelime.charAt(3);
            System.out.println("Tersten kelime:"+dort+uc+iki+bir);

        }else {
            System.out.println("Girdiginiz kelime uzunlugu dortten fazla");
        }








    }
}
