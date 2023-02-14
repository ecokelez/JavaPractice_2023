package day08;

import java.util.Scanner;

public class Q01_WhileLoop {


    // girilen sayının basamaklarındaki rakamların toplamını bulunuz.

    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            int sayi = scan.nextInt();



        basamakTopla(sayi);
        System.out.println(basamakTopla(sayi));

        }

    private static int basamakTopla(int sayi) {
        int toplam=0;

        while (sayi!=0){
            toplam+=sayi%10;  // 10'a bolumunden kalanını toplama ekle,
            sayi/=10;  //   kalan sayıyı yok etmek ıcın 10 a bol


        }
        return  toplam;
    }

}
