package day05;

public class Q03_StringManipulatıon {
    public static void main(String[] args) {
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

        String  str1= "$13.99";
        str1=str1.replaceAll("\\D","");
        System.out.println("str1 = " + str1);

        String str2= "$10.55";
        str2=str2.replaceAll("\\D","");
        System.out.println("str2 = " + str2);

        double sayı1=Double.parseDouble(str1);  // sayı1 degıskenını Strıng olan str1 den double  donusturduk.
        double sayı2= Double.parseDouble(str2);  //sayı2 degıskenını Strıng olan str2 den double  donusturduk

        double toplam=(sayı1+sayı2)/100;
        System.out.println("$" + toplam);





    }
}
