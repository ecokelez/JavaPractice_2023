package day04_;

import java.util.Scanner;

public class Q08_StringManipulation {
    /*
     * Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa son
     * iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin
     *
     * ornek
     * input = Ali
     * output = lilili
     *
     * input = el
     * output = el
     */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bır kelıme gırınız");
        String kelıme= scan.nextLine();

        if (kelıme.length()>=3){
            System.out.println(kelıme.substring(kelıme.length()-2));
        }









       }
    }






