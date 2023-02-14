package day10;

import java.util.ArrayList;
import java.util.List;

public class Q03_ArrayList {

    /*
     * verilen arrayin n sayisi kadar maksimun  degerlerini bulan java programi yaziniz
     * not kisa metodlar kullamayiniz
     * Input : {1,2,3,4,5,6,7,8} input n:2 Output : 7 and 8
     */
    public static void main(String[] args) {

        int []arr={1,2,3,4,5,-9,6,100,7,8,101,101,99,0};
        int n=4;

        // bir liste olusturalım;
        List<Integer> list=new ArrayList<>();

        // list eleman. ekelyelım;
        for (int each:arr) {
            list.add(each);
        }
        List<Integer> maxList= new ArrayList<>();

        int count=1;

        while (count<=n){
            int max=list.get(0);  // list' in ilk elemanı max. olsun
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i)>max && !(maxList.contains(list.get(i)))){
                    max=list.get(i);
                }

            }

            maxList.add(max);
            list.remove(list.indexOf(max)); // tekrar aynı sayıya bakmamak ıcın kaldırıdk
            count++;

        }
        System.out.println("Array' in max "+ n+ "elemanı"+ maxList);
    }

}