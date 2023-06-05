package day02_3;

import java.util.Scanner;

public class J02_SwitchCase {
      /*
        Print "Please enter your job title",
        create a variable called jobTitle and request it from the user,
        Use the following test data to get the  correct jobTitle;
        Example :
        If jobTitle is a QA ,your jobTitle  Quality Analyst,
         ... is a dev , print Developer
         ... is a ba, print Business Analyst,
         ...  is a pm , print Project Manager.
       */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your jobTitle");
        String jobTitle = scan.nextLine().toLowerCase();
        System.out.println("jobTitle : " + jobTitle);

        switch (jobTitle){
            case "qa" :
                System.out.println("Quality Analyst");
                break;
            case "dev" :
                System.out.println("Developer");
                break;
            case "ba" :
                System.out.println("Business Analyst");
                break;
            case "pm" :
                System.out.println("Project Manager");
                break;
            default:
                System.out.println("Please enter valid jobTitle");



        }

    }
}
