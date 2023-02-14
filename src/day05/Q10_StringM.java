package day05;

import java.util.Scanner;

public class Q10_StringM {
    public static void main(String[] args) {


        // Kullanicidan alacaginiz bir stringde bosluk karakterinin--
        // --olup olmadigini kontrol ediniz.
        // Kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol ediniz.

           /*
            Scanner scan=new Scanner(System.in);
            System.out.print("birinci stringi giriniz: ");
            String str1=scan.nextLine();
            System.out.print("ikinci stringi giriniz: ");
            String str2=scan.nextLine();

            if(str1.contains(" ")){
                System.out.println("birinci string" + " : bosluk iceriyor");
            }else System.out.println("birinci string" +  " : bosluk icermiyor");

            if(str2.length()==0){
                System.out.println("ikinci string " + " : bos");
            }else
                System.out.println("ikinci string" + " : bos degil");

            */

       /*
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bırınıc kelımeyı  gırınız");
        String str1= scan.nextLine();
        System.out.println("Lutfen ıkıncı kelımeyı  gırınız");
        String str2= scan.nextLine();

        if(!(str1.contains(" "))){
            System.out.println(" str1 : "  + " bosluk ıcermıyor ");
        }else System.out.println("str1 : " + " bosluk ıcerıyor ");

        if (str2.length()==0){
            System.out.println("str2 :" + " bos ");
        }else System.out.println("str2 : " + " bos degıl");

        */

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int bosluk = str.indexOf(' ');

        if (bosluk == -1 && !(str.isEmpty())) {
            System.out.println("bosluk yoktur");
        } else {
            System.out.println("bosluk vardir");
        }

        }

    }

