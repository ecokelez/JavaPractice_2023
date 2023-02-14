package day06;

import java.util.Scanner;

public class Q02_MethodCreation {
      /*
     cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
      */


    public static void main(String[] args) {



        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bır cm degeri gırınız");
        double sayı= scan.nextDouble();

        convertMetod(sayı);





    }

    private static void convertMetod(double sayı) {

        double meter=sayı/100;
        double kMeter=sayı/10000;

        System.out.println("Gırdıgınız cm degerı : "+ sayı + " : " + meter +" m 'dır,"+kMeter + "km'dır");


    }


}