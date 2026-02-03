//       * * * * 
//     * * * * 
//   * * * * 
// * * * * 


package Pattern_Printing;
import java.util.Scanner;

public class Rhombus{
    public static void main(String[] args) {
        Scanner raj = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int bhan = raj.nextInt();

        for(int i = 1; i <= bhan;i++){
            for(int j = 1; j <=bhan-i; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= bhan; j++){
                System.out.print("* ");
            }
        System.out.println();
        raj.close();           
        }

    }
    
}