package java_classwork;

import java.util.Scanner;

public class J11_StringM {
    /*
    Problem definition :
         Code a calculator that performs 4 simple operations....
          Have the user select the action to be performed using the action symbol.
          Ask the user enter two numbers
        Print the right result on the screen according to entered two nums and selected operation
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please select the operation you are going to do with the symbol");
        char symbol = sc.nextLine().charAt(0);

        System.out.println("Please select the first num");
        double firstNum = sc.nextInt();
        System.out.println("Please select the second num");
        double secondNum = sc.nextInt();

        if (symbol == '+'){
            System.out.println("Sum of the entered nums : " + (firstNum+secondNum));
        } else if (symbol == '-') {
            System.out.println("Subtraction of the entered nums : " + (firstNum - secondNum));
        } else if (symbol == '*') {
            System.out.println("Multiplication of the entered nums : " + (firstNum * secondNum));
        }else if (symbol == '/'){
            System.out.println("Division of the entered nums : " + (firstNum / secondNum));
        }
    }
}
