package day05;

import java.util.Scanner;

public class Q11_StringM {
    public static void main(String[] args) {
        /*
        Problem Tanımı :
        Basit 4 islem yapan bir hesap makinesi kodlayiniz....
         Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalinız.
         Kullanicidan iki sayi girmesini isteyiniz.
         Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
        */


        Scanner scan=new Scanner(System.in);
        System.out.println(" Lutfen yapacaginız islemi  sembol ile secınız ");
        char sembol=scan.nextLine().charAt(0);

        System.out.println("Lutfen bırincı  sayı gırınız");
        int sayı1= scan.nextInt();
        System.out.println("Lutfen ıkıncı   sayıyı gırınız");
        int sayı2= scan.nextInt();



        if(sembol=='+'){
            System.out.println("Gırılen sayıların toplamı : " + (sayı1+sayı2));
        } else if (sembol=='-') {
            System.out.println("Gırılen sayıların farkı :"+ (sayı1-sayı2));

        } else if (sembol=='*') {
            System.out.println("Gırılen sayıların carpımı :" + (sayı1*sayı2));
        } else if (sembol=='/') {
            System.out.println("Gırılen sayıların bolumu :" + (sayı1/sayı2));


        }


    }
}
