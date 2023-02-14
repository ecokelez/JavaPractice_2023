package day05;

import java.util.Scanner;

public class Q13_HesapMakinesi {
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
        char sembol=scan.next().charAt(0);

        System.out.println("Bırıncı sayıyı giriniz");
        int sayı1= scan.nextInt();
        System.out.println("Ikıncı sayıyı gırınız");
        int sayı2=scan.nextInt();

        HesapMakinesi(sembol,sayı1,sayı2);

    }

    private static void HesapMakinesi(char sembol, int sayı1, int sayı2) {

        if (sembol=='+' || sembol=='-' || sembol=='*' || sembol=='/'){
            switch (sembol){

                case  '+':
                    System.out.println(sayı1+" + "+sayı2+"="+ (sayı1+sayı2));
                    break;
                case '-':
                    System.out.println(sayı1+"-"+sayı2+"="+(sayı1-sayı2));
                    break;
                case '*':
                    System.out.println(sayı1+"*"+sayı2+"="+(sayı1*sayı2));
                    break;
                case '/':
                    System.out.println(sayı1+"/"+sayı2+"="+(sayı1/sayı2));
                    break;
                //default:
                   // System.out.println("Hatalı işlem girişi");

            }

        }else System.out.println("Hatalı işlem girişi");
    }
}
