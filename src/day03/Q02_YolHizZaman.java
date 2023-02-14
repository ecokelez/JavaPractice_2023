package day03;

import java.util.Scanner;

public class Q02_YolHizZaman {


    /*  Problem Tanımı
        Mesafeyi ve hızı alıp süreyi hesaplayan bir kod yazınız.
        Örneğin:İstanbul ile Ankara arası 400km olarak ölçülmektedir. Bu yolu ortalama
        120 km/saat hızla giden bir araç ne kadar sürede hedefe varır?

        Örnek Ekran Çıktısı
        Mesafeyi giriniz: 400
        Hızı giriniz: 100
        Süre 4 saattir.
     */
    public static void main(String[] args) {

   Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen yol mesafesını gırınız(km)");
        double yol= scan.nextDouble();


        System.out.println("Ortalama hızınızı gırınız");
        double ort_hız= scan.nextDouble();


        double varısSuresı=yol/ort_hız;
        System.out.println("varıs suresı : " + varısSuresı);


      //  scan.close();  ---->  satırı kapatmaya yarar







    }
}