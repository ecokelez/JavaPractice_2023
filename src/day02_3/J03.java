package day02_3;

import java.util.Scanner;

public class J03 {
/*
    Define final grade, solve with Nested Ternary
    'A' -> "Very Successful"
    'B' -> "Successful"
    'C' -> "Ha effort"
    and write "Others..." in the notes other than these.
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a final grade");
        char fNote = scan.nextLine().toUpperCase().charAt(0);
        String result = fNote == 'A' ? "Very Successful" : fNote == 'B' ? "Successful" : fNote == 'C' ? "Ha effort" : "Others";
        System.out.println("result : " + result);

    }
}
