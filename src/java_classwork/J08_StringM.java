package java_classwork;

import java.util.Scanner;

public class J08_StringM {
    /*
    Write a method that returns true if there is "xyz" string in the input String and false if not
     * input      output
     * axyzm  ==   true
     * xyz    ==   true
     * x.yz   ==   false
     * xyaz   ==   false
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string keyword");
        String str = sc.nextLine().toLowerCase();

        isXYZExist(str);
        System.out.println(isXYZExist(str));
    }

    private static boolean isXYZExist(String str) {
        if (str.contains("xyz")){
            return true;
        }else return false;
    }


}
