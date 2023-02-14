package day03;

import java.util.Scanner;

public class Q03_BMI {


		/*
		 Kullanicidan kilosunu ve boyunu alip
		 Vucut kitle indeksini hesaplayan bir program yaziniz.
		 Ipucu : Vucut
		 Kitle Indeksi (VKI) = Vucut Agirligi(kg.) / Boy uzunlugunun karesi (m.)
		 ORNEK:
		 INPUT      : Kilo: 71
		              Boy: 1,72
		 OUTPUT  : Vucut Kitle Indeksiniz : 23
		 	 */
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);

            System.out.println("Lutfen kg olarak kılonuzu gırınız");
            double kılo= sc.nextDouble();

            System.out.println("Lutfen cm olarak boyunuzu gırınız");
            double boy= sc.nextDouble();

           // boy= boy/100
            boy/=100;  // cm olarak gırılen boyu m ye donusturmek ııcn

            double VKI=kılo/(boy*boy);
            System.out.println("Vucut Kitle Indeksiniz :"+ VKI);












        }
}