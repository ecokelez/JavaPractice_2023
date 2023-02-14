package day06;

public class Q01_MethodCreation {

    /*
        Problem tanımı :
        Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method yazınız.
        Test Data:
        input: "aabbcccccddddaaa"
        output: abcd
     */

    public static void main(String[] args) {


        String ınput="aabbcccccddddaaa";


    BırDefaYazdır(ınput);



    }

    private static void BırDefaYazdır(String ınput) {

      String benzersızInput="";

        String ıslenecekKelıme=ınput.replaceAll("\\W","");
        System.out.print(ıslenecekKelıme.substring(0,1));
        benzersızInput+=ıslenecekKelıme.substring(0,1);

        for (int i = 1; i < ıslenecekKelıme.length(); i++) {

            if (!benzersızInput.contains(ıslenecekKelıme.substring(i,i+1))){

                System.out.print(","+ıslenecekKelıme.substring(i,i+1));
                benzersızInput+=ıslenecekKelıme.substring(i,i+1);
            }
            
        }

        System.out.println("");
        System.out.println("ınput : "+ ınput);
        System.out.println("benzersızInput : "+ benzersızInput);

    }


}



