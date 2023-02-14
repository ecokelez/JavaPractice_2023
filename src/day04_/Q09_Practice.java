package day04_;

import java.util.Scanner;

public class Q09_Practice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Dakika sayisi: ");
        int dakika = scan.nextInt();
        int gun = dakika / 60 / 24;
        System.out.println(dakika + " dakika yaklasik " + gun / 365 + " yil " + gun % 365 + " gundur");








    }
}

