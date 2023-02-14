package day03;

import java.util.Scanner;

public class Q08_KanBagisiYasAraligi {


		/*
		Problem tanimi :
		Kullanicidan  yasini ve kilosunu alaliniz
		18 yasindan kucuk ise kan bagisi yapamaz
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 ve 50  kilodan agir ise kan bagisi yapabilir.
		 */

    public static void main(String[] args) {
        // Scanner scan=new Scanner(System.in);
        // System.out.println("Lutfen yasınızı gırınız");
        // double yas= scan.nextDouble();

        // System.out.println("Lutfen kilonuzu gırınız");
        // double kılo= scan.nextDouble();

        //    if (yas<18){
        //        System.out.println("kan bagisi yapamazsınız");
        //    } else if (yas>18 && kılo<50) {
        //        System.out.println("kan bagisi yapamazsınız");
        //    } else if (yas>18 && kılo>50) {
        //        System.out.println("kan bagisi yapabilirsınız");
        //    }else {
        //        System.out.println("Lutfen gecerlı bır verı gırınız");
        //    }

        //    if (yas<18 || (yas>18 && kılo<50)){
        //        System.out.println("kan bagisi yapamazsınız");
        //    } else if (yas>18 && kılo>=50) {
        //        System.out.println("kan bagisi yapabilirsınız");
        //    }else {
        //        System.out.println("Lutfen gecerlı bır verı gırınız");
        //    }


        //** ternary **
        //String result=yas<18 || (yas>18 && kılo<50) ? "kan bagisi yapamazsınız"  :
        //           yas>18 && kılo>=50 ?  "kan bagisi yapabilirsınız" : "Lutfen gecerlı bır verı gırınız";
        //   System.out.println("result : " + result);

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasınızı gırınız");
        double yas = scan.nextDouble();

        System.out.println("Lutfen kilonuzu gırınız");
        double kılo = scan.nextDouble();

        if (yas > 0 && yas < 18) {
            System.out.println("18 yasından kucuk oldugunuz ıcın kan bagisi yapamazsınız");
        } else if (yas >= 18) {
            if (kılo > 0 && kılo < 50) {
                System.out.println("kılonuz 50 kg dan kucuk old. ıcın kan bagisi yapamazsınız");
            } else  {
                System.out.println("kan bagisi yapabılırsınız");
            }


        }
    }

}