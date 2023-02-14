package day06;

import java.util.Scanner;

public class Q03_MethodCreation {
       /*
  Kullanicidan alinan bir tamsayi kadar(47 den kucuk) FIBONACCI dizisi olusturun.
     0-1-1-2-3-5-8-13-21-34....
  */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("47 den kucuk bır tamsayı gırınız : ");

        int sayı=scan.nextInt();
        fibonacci(sayı);

    }
    private static void fibonacci(int sayı) {

        int sayı1=0;
        int sayı2=1;
        int sayı3;

        System.out.print(sayı1+ " ");
        System.out.print(sayı2+ " ");

        if(sayı<47){
            for (int i = 2; i < sayı; i++) {
                sayı3=sayı1+sayı2;
                System.out.print(sayı3+" ");
                sayı1=sayı2;
                sayı2=sayı3;

            }

        }else System.out.println("47 den kucuk bır tamsayı gırınız");
    }
}