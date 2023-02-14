package day03;

import java.util.Scanner;

public class Q07_BMISiniflama {

		/*
		 *  Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
		 *
		BMI = kilo(kg) /(boy*boy)(cm)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.

		 */
       //public static void main(String[] args) {

       //    Scanner scan=new Scanner(System.in);

       //    System.out.println("Lutfen kilonuzu (kg) olarak gırınız");
       //    double kılo= scan.nextDouble();

       //    System.out.println("Lutfen boyunuzu (cm) olarak gırınız");
       //    double boy= scan.nextDouble();

       //    double vKI=kılo/(boy*boy);
       //    System.out.println("Vucut Kitle Indeksiniz : "+ vKI);

       //    String VKI=vKI<=20 ? "oldukca zayifsiniz" : vKI>20 || vKI<=25 ? "Normal sinirlardasiniz"
       //                : vKI>25 || vKI<=30 ? "Sisman kategorisindesiniz" :  " Obez grubundasiniz";
       //    System.out.println("Vucut Kitle Indeksinizın Deger Aralıgı : "+ VKI);

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Kılonuzu kg olarak gırınız");
        double kılo= scan.nextDouble();


        System.out.println("Boyunuzu cm olarak gırınız");
        double boy=scan.nextDouble()/100;   // boyu ılk etapta "m" ye cevırdık

        double bmı=(kılo/boy*boy);
        
        if (bmı<20){
            System.out.println("bmi indeksınız : " + bmı + "oldukca zayıfsınız");
        } else if (bmı<=25) {
            System.out.println("bmi indeksınız : " + bmı + "Normal sinirlardasiniz");
        } else if (bmı<=30) {
            System.out.println("bmi indeksınız : " + bmı + "Sisman kategorisindesiniz");
        } else if (bmı>30) {
            System.out.println("bmi indeksınız : " + bmı + "Obez grubundasiniz");

        }


    }
        }


