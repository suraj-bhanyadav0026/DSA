//             1 
//           1 2 
//         1 2 3 
//       1 2 3 4 
//     1 2 3 4 5 
//   1 2 3 4 5 6 
// 1 2 3 4 5 6 7 

package Pattern_Printing;
import java.util.Scanner;

public class Vertically_Fliped_Num_Triangle {
    public static void main(String[] args) {
        Scanner raj = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int bhan = raj.nextInt();

        for(int i = 1; i <= bhan; i++){
            for(int j = 1; j <= bhan-i; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
            raj.close();
        }
    }
}

