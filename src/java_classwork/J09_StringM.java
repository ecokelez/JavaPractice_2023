package java_classwork;

public class J09_StringM {
    /*
    ==> create name1 and name2 variables,
    ==> if the name1 variable number  of characters is even , place the name2 at the middle name1,
    ==> if the name1 ariable number of characters is odd,
    print it as "we could not put the name2 at the middle of name1 because of name1 has not even".

    e.g:s
         name1= mehmet
         name2= ahmet
         Print ==> mehahmetmet
     */

    public static void main(String[] args) {
        String name1 = "mehmet";
        String name2 = "ahmet";

        if (name1.length()%2==0){
            System.out.println(name1.substring(0,name1.length()/2).concat(name2).concat(name1.substring(name1.length()/2)));
        }else System.out.println("we could not put the name2 at the middle of name1 because of name1 has not even");

    }


}
