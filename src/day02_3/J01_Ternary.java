package day02_3;

import java.util.Scanner;

public class J01_Ternary {

    /*
     Write a code using Ternary, define a variable called price.
     if the price is less than 10 then "cheap" ,
     Between 10 and 20 is "normal",
     If the price is 20 and over 20, it will be expensive
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a positive integer number");
        int price = scan.nextInt();
        // int price = 10;

        String result = price < 10 ? "cheap" : price < 20 ? "normal" : "expensive";
        System.out.println("result : " + result);
    }
}
