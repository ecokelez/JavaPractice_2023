package java_classwork;

import java.util.Scanner;

public class J07_StringM {
    /*
    Assk the user for 4 words and write them as a sentence,
    then put the . (dote) at end of the sentence

      * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
         *         Output : Cesaret insana sinirlarini ogretir.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first word");
        String str1 = sc.nextLine();
        System.out.println("Enter second word");
        String str2 = sc.nextLine();
        System.out.println("Enter third word");
        String str3 = sc.nextLine();
        System.out.println("Enter fourth word");
        String str4 = sc.nextLine();

        String sentence = str1.substring(0,1).toUpperCase()+" " +str1.substring(1)+
                str2.substring(0)+" "+str3.substring(0)+ " " +str4.substring(0)+ ".";
        System.out.println(sentence);


    }
}
