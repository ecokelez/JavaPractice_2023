package day03;

import java.util.Scanner;

public class Q05_Scanner {


    /*  Problem Tanımı
        Kullanıcıdan a,b ve c sayılarını okuyarak aşağıdaki işlemi yapan kodu yazınız
        a'nın karesinden b'nin karesini cikarip c nin 3 katina bolunuz

        Örnek Ekran Çıktısı
        a sayısını giriniz: 5
        b sayısını giriniz: 3
        c sayısını giriniz: 1
        sonuç : 5.333333333333333
        */
    public static void main(String[] args) {

    //Scanner scan= new Scanner(System.in);
//
    //    System.out.println("Lutfen a sayısını gırınız");
    //    double sayı1= scan.nextDouble();
//
    //    System.out.println("Lutfen b sayısını gırınız");
    //    double sayı2= scan.nextDouble();
//
    //    System.out.println("Lutfen c sayısını gırınız");
    //    double sayı3= scan.nextDouble();
//
    //    System.out.println("Problem cozumu : "+ ((sayı1*sayı1)-(sayı2*sayı2))/(sayı3*3));


        Scanner sc=new Scanner(System.in);
        double a;
        double b;
        double c;
        System.out.println("a sayısını gırınız");
         a= sc.nextDouble();
        System.out.println("b sayısını gırınız");
        b=sc.nextDouble();
        System.out.println("c sayısını gırınız");
        c=sc.nextDouble();

        double sonuc=((a*a)-(b*b))/(c*3);
        System.out.println("sonuc :"+ sonuc);


    }

}