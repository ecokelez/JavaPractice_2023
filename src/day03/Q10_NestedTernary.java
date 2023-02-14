package day03;

import java.util.Scanner;

public class Q10_NestedTernary {

    /*
    Final notu tanimlayin, Nested Ternary ile cozunuz
    'A'  ->  "Gayet Basarili"
    'B'  ->  "Basarili"
    'C'  ->   "Ha gayret"
    bu notlar disindakilere de Digerleri.. yazdiriniz
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bır fınal notu gırınız");
        char fNot=scan.nextLine().toUpperCase().charAt(0);


    String sonuc=(fNot=='A') ? "Gayet basarılı" : (fNot=='B' )? "Basarili" : (fNot=='C') ? "Ha gayret" : " Digerleri";
        System.out.println("sonuc: " + sonuc);

        // String tanımlamadan sout ' un icerısınde de yazabılırız

    }

}