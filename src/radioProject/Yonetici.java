package radioProject;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import static radioProject.Kullanici.kullanici;

public class Yonetici {

    static Scanner scan = new Scanner(System.in);
    static String yanit = "";
    static ArrayList<Depo> kanalListesi = new ArrayList<>();

    public static void giris() throws InterruptedException, UnsupportedAudioFileException, LineUnavailableException, IOException {
        String giris = "\n" + "***************************TREN FM*****************************\n"+
                "1 : KULLANICI GIRISI\n" +
                "2 : YONETICI GIRISI\n" +
                "3 : CIKIS";
        System.out.println(giris);
        yanit = scan.next();

        switch (yanit){
            case "1" :
                kullanici();
                break;
            case "2":
                yonetici();
                break;
            case "3" :
                cikis();
                break;

        }


    }

    public static void yonetici() throws InterruptedException, UnsupportedAudioFileException, LineUnavailableException, IOException {
        String yonetici = "\n"+"1 : KANAL EKLEME\n"+
                               "2 : KANAL LISTESI\n"+
                               "3 : KANAL SIL\n"+
                               "4 : ANA MENU\n"+
                               "5 : CIKIS";
        System.out.println(yonetici);
        yanit = scan.next();

        switch (yanit){
            case "1" :
                kanalEkleme();
                devamMi();
                yonetici();
                break;
            case  "2":
                kanalListesiGoster();
                System.out.println("MENUYE YONLENDIRILIYOR...");
                Thread.sleep(3000);
                yonetici();
                break;
            case  "3":
                kanalSil();
                System.out.println("MENUYE YONLENDIRILIYOR...");
                Thread.sleep(3000);
                yonetici();
                break;
            case  "4" :
                giris();
                break;
            case "5" :
                cikis();
                break;
        }
    }

    public static void cikis() {
        System.out.println("TREN FM KEYIFLI GUNLER DILER...");
    }

    public static void kanalSil() {
        if (kanalListesi.isEmpty()){
            System.out.println("SILINECEK KANAL YOK");
            System.out.println();
        }else {
            System.out.println("SILMEK ISTEDIGINIZ KANALLAR LISTESI");
            System.out.println(kanalListesi);
            scan.nextLine();
            System.out.println("SILMEK ISTEDIGINIZ KANALI YAZINIZ");
            String sil = scan.nextLine();

            for (Depo w:kanalListesi) {
                if (w.getIsim().equalsIgnoreCase(sil)){
                    kanalListesi.remove(w);
                }

            }
        }
    }

    public static void kanalListesiGoster() {
        for (Depo w:kanalListesi) {
            System.out.println(w);
        }
    }

    public static void kanalEkleme() {
        scan.nextLine();
        System.out.println("EKLEMEK ISTEDIGINIZ KANALI GIRINIZ");
        String isim = scan.nextLine();
        System.out.println("EKLEMEK ISTEDIGINIZ KANALIN FREKANSINI GIRINIZ");
        String frekans = scan.next();
        Depo kanalEkleme = new Depo(isim,frekans);
        kanalListesi.add(kanalEkleme);

    }

    public static boolean devamMi(){
        boolean devamMi = false;
        System.out.println("YENI KANAL EKLEMEK ISTER MISINIZ\n"+
                            "EVET  ya da HAYIR GIRINIZ");
        yanit = scan.next();

        while (yanit.equalsIgnoreCase("EVET")) {
            kanalEkleme();
            System.out.println("YENI KANAL EKLEMEK ISTER MISINIZ\n"+
                    "EVET  ya da HAYIR GIRINIZ");
            yanit = scan.next();
        }
        return devamMi;
    }
}
