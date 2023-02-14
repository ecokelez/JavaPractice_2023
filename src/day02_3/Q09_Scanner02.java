package day02_3;

import java.util.Scanner;

public class Q09_Scanner02 {

    public static void main(String[] args) {

        // kullaniciya ad, memleket,su anki konum, yas, boy soran bir program olusturun,
        // ve yasadiklari yeri seviyorlarsa
        // bu bilgiyi yazdirin

        // next() only can read the first word
        // nextLine() can read the whole line

        Scanner scan=new Scanner(System.in);

        System.out.println(" Adınız :");
        String ad=scan.nextLine();

        System.out.println("Memleketınız : ");
        String memleket= scan.nextLine();


        System.out.println("Konumunuz : ");
        String konum= scan.nextLine();

        System.out.println("Yasınız : ");
        int yas= scan.nextInt();

        System.out.println("Boyunuz : ");
        double boy=scan.nextDouble();

        System.out.println("Yasadıgınız "+ konum + " u sevıyor musunuz ? ");
        boolean sevıyorMu=scan.nextBoolean();


        System.out.println("ad = " + ad);
        System.out.println("memleket = " + memleket);
        System.out.println("konum = " + konum);
        System.out.println("yas = " + yas);
        System.out.println("boy = " + boy);
        System.out.println("sevıyor = " + sevıyorMu);








    }
}
