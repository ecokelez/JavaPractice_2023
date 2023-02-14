package day05;

import java.util.Scanner;

public class Q08_StringM {
    public static void main(String[] args) {

        /*
            Kullanicidan "bir kelime girmesin"i isteyin.
             * Sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
            * kelimenin ortasindaki karakteri yazdirin.
        */

        Scanner scan=new Scanner(System.in);
        System.out.println("bir kelime girin");
        String str= scan.nextLine();

        char ortK=str.charAt((str.length()-1)/2);


        if(str.length()%2==1 && str.length()>=3){
            System.out.println("ortanca kelıme : "+ ortK);
        }




    }
}
