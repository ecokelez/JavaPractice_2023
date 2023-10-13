package java_classwork;

import java.util.Scanner;

public class J10_StringM {
    /*
    // Check whether there is a space character in a string you receive from the user.
    // Check whether a string you receive from the user is empty.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a word");
        String str = sc.nextLine();
        int space = str.indexOf(' ');

        if (space== -1 && ! (str.isEmpty())){
            System.out.println("The entered text does not contain spaces");
        }else System.out.println("The entered text contains spaces");
    }
}
