package day04_;

import java.util.Scanner;

public class Q06_StringManipulation {
    //Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi method kullanarak birlestiriniz.

    //yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.


    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Kelıme gırınız");
        String str1= scan.nextLine();
        System.out.println("Kelıme gırınız");
        String str2= scan.nextLine();

        System.out.println(str1+str2);
        System.out.println(str1.concat(str2));


        String kelımeIlkH=str1.replaceAll("0","");
        String kelımeGeriyeK=str1.substring(1);

        String ıkıncıkelımeIlkH=str2.replaceAll("0","");
        String ıkncıKGerıyeK=str2.substring(1);

        System.out.println(kelımeGeriyeK.concat(ıkncıKGerıyeK));








    }
}