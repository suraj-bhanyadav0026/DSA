//  * * * * * * * 
//    * * * * * * 
//      * * * * * 
//        * * * * 
//          * * * 
//            * * 
//              * 

package Pattern_Printing;
import java.util.Scanner;

public class Inverted_Right_Triangle {
    public static void main(String[] args) {
        Scanner raj = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int bhan = raj.nextInt();

        for (int i = 0; i < bhan; i++) {
            for (int j = 0; j < i * 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < bhan - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        raj.close();
    }
}

