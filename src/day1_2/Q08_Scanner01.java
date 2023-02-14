package day1_2;

import java.util.Scanner;

public class Q08_Scanner01 {

     // kullanicidan 2 tam sayi alin
    // bu tam sayilari toplayin ve sonucu yazdirin

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("birinci sayiyi giriniz :");
        int sayi1= scan.nextInt();

        System.out.println("ikinci sayiyi giriniz");
        int sayi2= scan.nextInt();
        System.out.println("iki sayinin toplamı : "+ (sayi1+sayi2));







    }




}
