package day03;

import java.util.Scanner;

public class Q06_Scanner {


    /*  Problem Tanımı
        Bir işçinin işi bitirme süresini ve toplam işçi sayısını alarak, işin bitme süresini
        hesaplayan kodu yazınız.
        Örneğin, Bir işçi bir işi 10 günde yapabilmektedir.
        Buna göre 2 işçi aynı işi kaç günde yapar?

        Örnek Ekran Çıktısı
         Bir işçi işi kaç günde bitirmektedir? 10
         Toplam kaç işçi çalışacak? 2
        İşin bitme süresi 5 gündür.
    */

    public static void main(String[] args) {

    //   Scanner sc=new Scanner(System.in);
    //   System.out.println("Bir işçi işi kaç günde bitirmektedir?");
    //   int iBitirmeGun=sc.nextInt();
    //   System.out.println("Toplam kaç işçi çalışacak ? ");
    //   int iS= sc.nextInt();


    //   System.out.println("Isın bıtme suresi : " + (iBitirmeGun/iS));


      Scanner scan=new Scanner(System.in);
        System.out.print("Bir işçi işi kaç günde bitirmektedir?");
        double iBitirmeGun=scan.nextInt();
        System.out.println("Toplam kaç işçi çalışacak ? : ");
        double iS= scan.nextInt();

        double cokluBıtırmeS=iBitirmeGun/iS;
        System.out.println("Coklu bıtırme suresi : " + iBitirmeGun/iS);






    }

}