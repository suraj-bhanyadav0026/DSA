//         A 
//       B B 
//     C C C 
//   D D D D 
// E E E E E 

package Pattern_Printing;
import java.util.Scanner;

public class  Vertically_Fliped_Alphabet_Triangle1{
    public static void main(String[] args) {
        Scanner raj = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int bhan = raj.nextInt();

        for(int i = 1; i <= bhan; i++){
            for(int j = 1; j <= bhan-i; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print((char)(i+64)+" ");
            }
            System.out.println();
            raj.close();
        }
    }
}

