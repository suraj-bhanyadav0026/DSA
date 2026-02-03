// * * * * * * * * * * * 
// * * * * *   * * * * * 
// * * * *       * * * * 
// * * *           * * * 
// * *               * * 
// *                   *


package Pattern_Printing;
import java.util.Scanner;

public class Bridge{
    public static void main(String[] args) {
        Scanner raj = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int bhan = raj.nextInt();
        for(int l = 1; l <= 2*bhan+1; l++){
            System.out.print("* ");
            }
            System.out.println();

        for(int i = 1; i <= bhan;i++){
            for(int j = 0; j <= bhan-i; j++){
                System.out.print("* ");
            }
            for(int j = 1; j <= 2*i-1; j++){
                System.out.print("  ");

            }
            for(int j = 0; j <= bhan-i; j++){
                System.out.print("* ");
            }
            System.out.println();


        }
        raj.close();        
    }
    
}
