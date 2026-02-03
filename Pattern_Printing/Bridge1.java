// * * * * * * * * * * * 
// * * * * *   * * * * * 
// * * * *       * * * * 
// * * *           * * * 
// * *               * * 
// *                   * 


package Pattern_Printing;
import java.util.Scanner;

public class Bridge1{
    public static void main(String[] args) {
        Scanner raj = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int bhan = raj.nextInt();
        for(int l = 1; l <= 2 * bhan - 1; l++){
            System.out.print("* ");
        }System.out.println();

        int space = 1;


        for(int i = 1; i <= bhan-1;i++){
            for(int j = 1; j <= bhan-i; j++){
                System.out.print("* ");
            }
            for(int j = 1; j <= space; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= bhan-i; j++){
                System.out.print("* ");
            }
            space +=2;
            System.out.println();


        }
        raj.close();
    }
    
}
