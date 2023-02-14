package day05;

import java.util.Scanner;

public class Q01_StringManipulation {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("isminizı ve soyisiminızı  girınız");
        String ısım= scan.nextLine(), soyısım=scan.nextLine();   // multıple declaration

        String fullName=ısım.concat(" "+ soyısım).toUpperCase();
        System.out.println("fullName = " + fullName);




    }
}
