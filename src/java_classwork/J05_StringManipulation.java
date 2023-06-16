package java_classwork;

import java.util.Scanner;

public class J05_StringManipulation {

    // Ask the user for a four-letter hand and
    // Print the entered word backwards
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter four-letter word");
        String str = scan.nextLine();

       // 1. method :
        if (str.length()==4){
           char one = str.charAt(0);
           char two = str.charAt(1);
           char three = str.charAt(2);
           char four = str.charAt(3);
            System.out.println("Str : " + one+two+three+four);
        } else System.out.println("Please enter a  valid word");

        // 2. method :
       String reverse = str.substring(3)+
               str.substring(2,3)+
               str.substring(1,2)+
               str.substring(0,1);
        System.out.println("reverse : " + reverse);


    }
}
