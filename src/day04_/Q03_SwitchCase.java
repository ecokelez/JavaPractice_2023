package day04_;

import java.util.Scanner;

public class Q03_SwitchCase {
    // Girilen uc haneli bir sayının okunusnu yazı ile yazdırınız.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Uc basmaklı brı sayı gırınız : ");

        int sayı = scan.nextInt();
        int bırlerB = sayı % 10, onlarB = (sayı / 10) % 10, yuzlerB = sayı / 100;

        if (sayı > 99 && sayı < 1000) {
            switch (yuzlerB) {
                case 0: System.out.println("");break;
                case 1: System.out.println("Yuz\t");break;
                case 2: System.out.println("IkıYuz\t");break;
                case 3: System.out.println("UcYuz\t");break;
                case 4: System.out.println("DortYuz\t");break;
                case 5: System.out.println("BesYuz\t");break;
                case 6: System.out.println("AltıYuz\t");break;
                case 7: System.out.println("YedıYuz\t");break;
                case 8: System.out.println("SekızYuz\t");break;
                case 9: System.out.println("DokuzYuz\t");break;  // Ctrl D mOUSE Sol tusna asagıya cek
            }
            switch (onlarB) {
                case 0: System.out.println("");break;
                case 1: System.out.println("on\t");break;
                case 2: System.out.println("yırmı\t");break;
                case 3: System.out.println("otuz\t");break;
                case 4: System.out.println("kırk\t");break;
                case 5: System.out.println("ellı\t");break;
                case 6: System.out.println("Altmıs\t");break;
                case 7: System.out.println("Yetmıs\t");break;
                case 8: System.out.println("Seksen\t");break;
                case 9: System.out.println("Doksan\t");break;
            }
            switch (bırlerB) {
                case 0: System.out.println("");break;
                case 1: System.out.println("bır\t");break;
                case 2: System.out.println("ıkı\t");break;
                case 3: System.out.println("uc\t");break;
                case 4: System.out.println("dort\t");break;
                case 5: System.out.println("bes\t");break;
                case 6: System.out.println("altı\t");break;
                case 7: System.out.println("yedı\t");break;
                case 8: System.out.println("sekız\t");break;
                case 9: System.out.println("dokuz\t");break;
            }
        }
    }
}