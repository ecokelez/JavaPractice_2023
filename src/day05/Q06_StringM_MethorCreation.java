package day05;

import java.util.Scanner;

public class Q06_StringM_MethorCreation {
    /*
     * girilen String icinde "xyz" dizimi var ise true ,degilse false return eden metod yaziniz
     *
     * input      output
     * axyzm  ==   true
     * xyz    ==   true
     * x.yz   ==   false
     * xyaz   ==   false
     */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bır string gırınız");
        String str=scan.nextLine().toLowerCase();

        xyzVarMı(str);


        System.out.println( xyzVarMı(str));
        
    }

    public static boolean xyzVarMı(String str) {

        if (str.contains("xyz")){
            return true;

        }else
            return false;
    }
}
