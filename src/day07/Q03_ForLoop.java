package day07;

public class Q03_ForLoop {

      /*
	 	Get the number of rows and columns from user.
	 	Create a rectangle.
	 	rows = 3 and column = 5 ==> * * * * *
	 	                            * * * * *
	 	                            * * * * *


	 */
      public static void main(String[] args) {


          int yukseklık=3;
          int boy=4;

          for (int i = 1; i <=yukseklık ; i++) {
              for (int j = 1; j <=boy ; j++) {
                  System.out.print("* ");
              }
              System.out.println(" ");
          }

      }
}
