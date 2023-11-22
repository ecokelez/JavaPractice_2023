package java_classwork;

public class J12_ForLoop {
    /*
        Print on the screen the numbers from 100 to 0 that are exactly divisible by 13 (from greater than to less than).
        The output should be as follows; also print the sum of these numbers afterwards
        desired result :
         91
         78
         65
         52
         39
         26
         13 */

    public static void main(String[] args) {
        int sum = 0;
        System.out.println("Result = " + sum);

        for (int i = 100; i >= 0; i--) {
            if (i%13==0){
                System.out.println(i);
                sum += i;
            }

        }
        System.out.println("Number of sum: " + sum);
    }
}
