package day05;

import java.util.Scanner;

public class Q01_StringManipulation {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("isminizı ve soyisiminızı  girınız");
        String isim= scan.nextLine(), soyisim=scan.nextLine();   // multıple declaration

        String fullName=isim.concat(" "+ soyisim).toUpperCase();
        System.out.println("fullName = " + fullName);




    }
}
