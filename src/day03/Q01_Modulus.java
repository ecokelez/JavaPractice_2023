package day03;

import java.util.Scanner;

public class Q01_Modulus {
    /*
     *  Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
     *
     *   Ex :
     *   input  : 12345
     *   output : 12
     */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 5 basamakli sayi gırınız");
        int num=scan.nextInt();

        int ilkIkı=num/1000;
        int sonIkı=num%100;  // 100 e bolumunden kalanı verır.

        int ilkIkıTop=(ilkIkı/10) + (ilkIkı%10);
        System.out.println("ilkIkıTop = " + ilkIkıTop);

        int sonIkıTop=(sonIkı/10) + (sonIkı%10);
        System.out.println("sonIkıTop = " + sonIkıTop);

        System.out.println("sayıların toplamı : " + (ilkIkıTop+sonIkıTop));






    }


}