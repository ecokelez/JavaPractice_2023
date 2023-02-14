package day06;

public class Q01_MC_T {
    public static void main(String[] args) {

          /*
        Problem tanımı :
        Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method yazınız.
        Test Data:
        input: "aabbcccccddddaaa"
        output: abcd
     */
        String ınput="aabbcccccddddaaa";
        bırKereYazdır(ınput);


    }

    private static void bırKereYazdır(String ınput) {

        String output="";  //String default degeri "" oldugu icin isleme etki etmesin diye bu sekilde atama yaptik


        for (int i = 0; i <ınput.length() ; i++) {  //(int i = 0; i <ınput.length()-1 ; i++) --bu sekılde de olur
            if (!output.contains(ınput.substring(i,i+1))){  // tekrarsız karakterleri domdurecegımız ıcın
                                                            // sonucumuz ınput' tan aldığımız herhangı
                                                            //  bır karakterı ıcermez
                output+=ınput.substring(i,i+1);           // o zaman sonucu ekleyelım
            }
        }
        System.out.println(output);


    }


}
