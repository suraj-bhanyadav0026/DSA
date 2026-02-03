//             A 
//           A B 
//         A B C 
//       A B C D 
//     A B C D E 
//   A B C D E F 
// A B C D E F G 

package Pattern_Printing;
import java.util.Scanner;

public class  Vertically_Fliped_Alphabet_Triangle{
    public static void main(String[] args) {
        Scanner raj = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int bhan = raj.nextInt();

        for(int i = 1; i <= bhan; i++){
            for(int j = 1; j <= bhan-i; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
            raj.close();
        }
    }
}

