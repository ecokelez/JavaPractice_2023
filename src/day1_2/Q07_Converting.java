package day1_2;

import java.util.Scanner;

public class Q07_Converting {
    public static void main(String[] args) {


        /*
    galonu litreye ceviren bir java programi yaziniz
        1 gallon = 3.785 litre
    litreyi galona ceviren bir java programi yaziniz
        1 litre = 1/3.785 gallon

    // Sıcaklığı Fahrenhayt'tan Santigrat derecesine çeviren bir Java programı yazın.
    // formül
    // c = (f-32)*5/9

    */

        int gallon=1000;
        double litre=gallon*3.785;
        String sonuc1=gallon+ " galon degeri " + litre+ "litreye eşittir";
        System.out.println(sonuc1);  // 1000 galon degeri 3785.0litreye eşittir


        int l=1000;
        double G=l/3.785;
        System.out.println(l+" litre degeri " + G +" gallona esittir");
          //1000 litre degeri 264.2007926023778 gallona esittir

        Scanner scan=new Scanner(System.in);
        System.out.println("fahrenayt degerini giriniz : ");
        double fh= scan.nextDouble();

        System.out.println("girdiginiz fahrenayt degeri : "+fh+  " karsılıgı " + (fh-32)*5/9 + " santigrat decedir");


    }
}
