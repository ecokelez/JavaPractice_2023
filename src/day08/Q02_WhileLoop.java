package day08;

import java.util.Scanner;

public class Q02_WhileLoop {
    public static void main(String[] args) {
          /*
         Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
         girilen sayı dahil(tek ise)
        */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bır sayı gırınız");
        int sayı= scan.nextInt();

        int count=0;
        while (sayı>0){
            if (sayı%2==1){
                System.out.println(sayı);
                count++;
            }
            sayı--;
        }
        System.out.println("count="+count);
    }
}
