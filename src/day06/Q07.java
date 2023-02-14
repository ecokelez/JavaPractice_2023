package day06;

public class Q07 {
    public static void main(String[] args) {

        String ınput="aabbcccccddddaaa";

        BırDefaYzadır(ınput);



    }

    private static void BırDefaYzadır(String ınput) {

        String benzersızInput="";




        for (int i = 0; i < ınput.length(); i++) {

            if (!benzersızInput.contains(ınput.substring(i,i+1))){

                benzersızInput+=ınput.substring(i,i+1);
            }

        }

        System.out.println("");
        System.out.println("ınput : "+ ınput);
        System.out.println("benzersız ınput :" + benzersızInput);



    }
}
