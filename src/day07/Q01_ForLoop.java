package day07;

import java.util.Scanner;

public class Q01_ForLoop {

     /*Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
     değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
     1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
     Sesli harfler: a,e,i,o,u

     Test Data:
     a
     Beklenen Çıktı:
     a harfi sesli harfdir.

     Test Data:
     d
     Beklenen Çıktı:
     d harfi sesiz harftir.

     Test Data:
     we  yada  %

     Beklenen Çıktı:
     Yanlis karakter girdiniz!

     */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println( "Lutfen bır harf gırınız");
        String harf= scan.next().toLowerCase();

        String seslıHarfler="aeıiou";
        String sessizHarfler="bcdfghjklmnpqrstxvyz";

        if (harf.length()==1){
            for (int i = 0; i <seslıHarfler.length(); i++) {
                if (seslıHarfler.contains(harf)){
                    System.out.println("sesli harf");
                    break;
                } else if (sessizHarfler.contains(harf)) {
                    System.out.println("sessiz harf");
                    break;
                }

            }
        }else System.out.println("tek karakter gırınız");

    }

}