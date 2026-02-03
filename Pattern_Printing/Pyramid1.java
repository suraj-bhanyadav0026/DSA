//             * 
//           * * * 
//         * * * * * 
//       * * * * * * * 
//     * * * * * * * * * 
//   * * * * * * * * * * * 
// * * * * * * * * * * * * * 

package Pattern_Printing;
import java.util.Scanner;

public class Pyramid1{
    public static void main(String[] args) {
        Scanner raj = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int bhan = raj.nextInt();
        int nsp = bhan-1 , nst = 1;

        for(int i = 1; i <= bhan;i++){
            for(int j = 1; j <= nsp; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= nst; j++){
                System.out.print("* ");

        }
        nsp --;
        nst +=2;
        System.out.println();
    }
    raj.close();
    
}
}