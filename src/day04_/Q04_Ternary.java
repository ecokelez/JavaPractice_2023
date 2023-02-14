package day04_;

public class Q04_Ternary {

    public static void main(String[] args) {

        /*
    0 ~ 9 arasındaki sayilari cevirebilen bir java programi yazin
   kelimelere, sayı 9'dan buyuk veya sifirdan kucukse,
   cikis "Gecersiz" olmalidir
   NestedIf ve Ternary kullanarak 2 yolla da cozunuz
 */

        int s=4;

        String result= s==9 ? "dokuz" : s==8 ? "sekız" : s==7 ? "yedı" : s==6 ? "altı"
                : s==5 ? "bes": s==4 ? "dort" : s==3 ? "uc" : s==2 ? "ıkı" :s==1 ? "bır": s==0 ? "sıfır" : "gecerszı" ;

        System.out.println("result :"+ result);



    }
}
