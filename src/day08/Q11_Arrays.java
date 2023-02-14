package day08;

import java.util.Scanner;

public class Q11_Arrays {
    // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.

    public static void main(String[] args) {


        String pin="mehmet.1234";
        int gırısHakkı=3;

        Scanner scan=new Scanner(System.in);
        System.out.println("**********HOSGELDINIZ***********");

        while (true){
            System.out.println("Pın kodunuzu gırınız");
            String gırılenPın= scan.nextLine();

            if (pin.equals(gırılenPın)){
                System.out.println("Basarılı gırıs yaptınız");
                break;
            }else{
                System.out.println("Yanlıs gırıs yaptınız..");
                gırısHakkı--;
                System.out.println("Kalan gırıs hakkınız : " +gırısHakkı);
            }
            if(gırısHakkı==0) {
                    System.out.println("Gırıs hakkınız kalmadı.. bloklandınız..");
                    break;
                }

        }
    }
}
