package day03;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Q09_NestedIF {

    /*
    Kullanici dan yas bilgisini alarak

	    oy kullanma yasi :
	 	age >= 18  ==> oy kullanmaya uygun
	 	age >= 70  ==> uc kez oy kullanabilir
	 	70 > age >=50 ==> iki kez oy kullanabilir
	 	50 > age >=18 ==> bir kez oy kullanabilir, yazdiriniz

	 */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = scan.nextInt();

        if (age>= 70 ){
            System.out.println("can vote three times");
        } else if (age>=50 && age<70) {
            System.out.println("can vote twice");
        } else if (age>=18 && age<50) {
            System.out.println("can vote once");
        }else if (age>= 18){
            System.out.println("eligible to vote");
        }

    }

    }
