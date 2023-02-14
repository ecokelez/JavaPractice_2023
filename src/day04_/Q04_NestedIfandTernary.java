package day04_;

public class Q04_NestedIfandTernary {
     /*
    0 ~ 9 arasındaki sayilari cevirebilen bir java programi yazin
   kelimelere, sayı 9'dan buyuk veya sifirdan kucukse,
   cikis "Gecersiz" olmalidir
   NestedIf ve Ternary kullanarak 2 yolla da cozunuz
 */
     public static void main(String[] args) {
         int sayı=5;
         String sonuc="";

         if(sayı>=0 && sayı<=9){
             if(sayı==9){sonuc="dokuz";}
             else if (sayı==8) {sonuc="sekız";}
             else if (sayı==7) {sonuc="yedı";}
             else if (sayı==6) {sonuc="altı";}
             else if (sayı==5) {sonuc="bes";}
             else if (sayı==4) {sonuc="dort";}
             else if (sayı==3) {sonuc="uc";}
             else if (sayı==2) {sonuc="ıkı";}
             else if (sayı==1) {sonuc="bır";}
             else sonuc="sıfır";


             }else sonuc="gecersız";
         System.out.println("sonuc :"+ sonuc);
          }
         }










