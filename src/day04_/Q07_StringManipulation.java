package day04_;

public class Q07_StringManipulation {

    // String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
    // String  str 1= "$13.99"
    // String str 2= "$10.55"
    // ipucu: Double parseDouble() methodunu kullanabilirsiniz.

     /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
		 1) \\d    ==> tum rakamlar
		  	 \\D    ==> tum rakam disi character ler
		 2) \\w   ==> A->Z		a->z			0->9    _
		 	 \\W  ==> A->Z		a->z			0->9    _ disindaki hersey
		 3) \\s   ==> space
		 	 \\S   ==> space disindaki hersey  */


    public static void main(String[] args) {

        String  str1= "$13.99";
        String str2= "$10.55";

         String sayi1=str1.replace("$","");
         String sayi2=str2.replace("$","");

          double sayi3=Double.parseDouble(sayi1);
          double sayi4=Double.parseDouble(sayi2);

          System.out.println("$"+ (sayi3+sayi4));




    }

}