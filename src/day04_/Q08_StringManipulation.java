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
        System.out.println("Lutfen bır kelime gırınız");
        String kelime= scan.nextLine();

      if (kelime.length()>=3){
            System.out.println(kelime.substring(kelime.length()-2)+
                               kelime.substring(kelime.length()-2)+
                                kelime.substring(kelime.length()-2));
        }else System.out.println(kelime);



        }
    }






