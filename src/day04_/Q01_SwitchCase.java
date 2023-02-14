package day04_;

public class Q01_SwitchCase {
    /*
    gunleri gösterebilen bir program yazın
    gun Pazartesi veya Sali ise:
    Java dersi gunleri

    gun Persembe veya Cuma ise:
    Selenyum dersi gunleri

    gun carsamba veya cumartesi ise:
    SQL dersi gunleri

    aksi halde: izin gunu
    (if deyimini KULLANMAYIN)
*/
    public static void main(String[] args) {

        String gun = "Cuma";

        switch (gun) {
            case "Pazartesı":
            case "Salı":
                System.out.println(" Java dersi gunleri");
                break;
            case "Carsamba":
            case "Cumartesı":
                System.out.println("SQL dersi gunleri");// Ctrl Alt L tusuna bas tum Classın yapısını duzeltır
                break;
            case "Persembe":
            case "Cuma":
                System.out.println("Selenyum dersi gunleri");
                break;
            default:
                System.out.println("izin gunu");
        }


    }
}