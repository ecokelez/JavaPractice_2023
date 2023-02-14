package day09;

import java.util.Arrays;
import java.util.Scanner;

public class Q06_Arrays {

       /*

    kullanıcının girdigi bir array'in en buyuk elemani ile
    en kucuk elemanının  farkını bulan bir method create ediniz.

 */
       public static void main(String[] args) {

           farkınıBul();
       }

    private static void farkınıBul() {
           Scanner scan=new Scanner(System.in);
        System.out.println("array'in uzunlugunu gırın : ");

        int uzunluk= scan.nextInt();
        int arr[]=new int[uzunluk];

        for (int i = 0; i <uzunluk ; i++) {

            System.out.println("array'in "+ (i+1)+". elemanını giriniz :"); // i--> old. 0. eleman diyecek,biz index degıl
                                                                            // fori' den gelen index'ler,
            arr[i]= scan.nextInt();

        }

        Arrays.sort(arr);
        System.out.println("arraydeki en buyuk eleman ile en kucuk arasındakı fark :"+(arr[uzunluk-1]-arr[0]));


    }
}