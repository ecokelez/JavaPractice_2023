package day04_;

public class Q04_NestedIfandTernary {
     /*
    0 ~ 9 arasındaki sayilari cevirebilen bir java programi yazin
   kelimelere, sayı 9'dan buyuk veya sifirdan kucukse,
   cikis "Gecersiz" olmalidir
   NestedIf ve Ternary kullanarak 2 yolla da cozunuz
 */
     public static void main(String[] args) {
         int sayi=5;
         String sonuc="";

         if(sayi>=0 && sayi<=9){
             if(sayi==9){sonuc="dokuz";}
             else if (sayi==8) {sonuc="sekız";}
             else if (sayi==7) {sonuc="yedı";}
             else if (sayi==6) {sonuc="altı";}
             else if (sayi==5) {sonuc="bes";}
             else if (sayi==4) {sonuc="dort";}
             else if (sayi==3) {sonuc="uc";}
             else if (sayi==2) {sonuc="ıkı";}
             else if (sayi==1) {sonuc="bır";}
             else sonuc="sıfır";


             }else sonuc="gecersız";
         System.out.println("sonuc :"+ sonuc);
          }
         }










