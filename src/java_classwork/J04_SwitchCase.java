package java_classwork;

import java.util.Scanner;

public class J04_SwitchCase {

    // Print the reading of an entered three-digit number with text.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a three digit number ");
        int num = scan.nextInt();
        int onesDigit = num % 10 , tensDigit = (num / 10) % 10, hundredsDigit = num / 100 ;

        if (num > 99 && num < 1000){

            switch (hundredsDigit){
                case 0 : System.out.println("");break;
                case 1 : System.out.println("Yuz");break;
                case 2 : System.out.println("Ikiyuz");break;
                case 3 : System.out.println("Ucyuz");break;
                case 4 : System.out.println("Dortyuz");break;
                case 5 : System.out.println("Besyuz");break;
                case 6 : System.out.println("Altiyuz");break;
                case 7 : System.out.println("Yediyuz");break;
                case 8 : System.out.println("Sekizyuz");break;
                case 9 : System.out.println("Dokuzyuz");break;
            }

            switch (tensDigit){
                case 0 : System.out.println("");break;
                case 1 : System.out.println("On");break;
                case 2 : System.out.println("Yirmi");break;
                case 3 : System.out.println("Otuz");break;
                case 4 : System.out.println("Kirk");break;
                case 5 : System.out.println("Elli");break;
                case 6 : System.out.println("Altmis");break;
                case 7 : System.out.println("Yetmis");break;
                case 8 : System.out.println("Seksen");break;
                case 9 : System.out.println("Doksan");break;
            }

            switch (onesDigit){
                case 0 : System.out.println("");break;
                case 1 : System.out.println("Bir");break;
                case 2 : System.out.println("Iki");break;
                case 3 : System.out.println("Uc");break;
                case 4 : System.out.println("Dort");break;
                case 5 : System.out.println("Bes");break;
                case 6 : System.out.println("Alti");break;
                case 7 : System.out.println("Yedi");break;
                case 8 : System.out.println("Sekiz");break;
                case 9 : System.out.println("Dokuz");break;

            }




        }
  }
}
