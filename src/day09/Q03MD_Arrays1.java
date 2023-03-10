package day09;

public class Q03MD_Arrays1 {
    /*
     * Girilen Multidimensional arraydeki cift sayilari toplayan bir method
     * yaziniz
     * INPUT : {{1,3,6},{2,8},{5,7,9,14}}
     *
     * OUTPUT : Arraydeki cift sayilarin toplami : 30
     */

    public static void main(String[] args) {

        int[][] arr = {{1, 3, 6}, {2, 8}, {5, 7, 9, 14}};

        cıftSayıTopla(arr);

    }

    private static void cıftSayıTopla(int[][] arr) {

        int toplam=0;

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] % 2 == 0) {
                    toplam+=arr[i][j];

                }

            }
        }

        System.out.println("cıftSayıTopla : "+ toplam);
    }

}
