// A A A A 
// B B B 
// C C 
// D 

package Pattern_Printing;
import java.util.Scanner;

public class Fliped_Alphabet_AA_Triangle {
    public static void main(String[] args) {
        Scanner raj = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int bhan = raj.nextInt();
        int result = bhan;

        for(int i = 1; i <= bhan; i++){
            for(int j = 1; j <= result; j++){
                System.out.print((char)(i+64)+" ");
            }
            result--;
            System.out.println();
            raj.close();
        }
    }
    
}
