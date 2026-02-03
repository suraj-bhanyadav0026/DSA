//             * 
//           * * * 
//         * * * * * 
//       * * * * * * * 
//     * * * * * * * * * 
//   * * * * * * * * * * * 

package Pattern_Printing;
import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner raj = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int bhan = raj.nextInt();

        for(int i = 1; i <= bhan; i++){
            for(int j = 1; j <= bhan-i; j++){
               System.out.print("  ");
            }
            for(int j = 1; j <= 2*i-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        raj.close();
    }
    
}
