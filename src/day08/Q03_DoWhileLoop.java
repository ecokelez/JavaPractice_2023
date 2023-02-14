package day08;

import java.util.Scanner;

public class Q03_DoWhileLoop {
    public static void main(String[] args) {
         /*
    Kullanıcıda x girilene kadar ekrana "Program çalışıyor" yazan
    ve x girildiğinde ise "Program bitti" yazan programı yazınız.
    */


        Scanner abc=new Scanner(System.in);
        String okunan="";

        do {
            System.out.println("Harf gırınız");
             okunan=abc.next();
            System.out.println("Program calısıyor");
        }while (!okunan.equalsIgnoreCase("X"));

        System.out.println("Program bitti");


    }
}
