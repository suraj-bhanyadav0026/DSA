// A B C D E 
// A B C D 
// A B C 
// A B 
// A

package Pattern_Printing;
import java.util.Scanner;

public class Fliped_Alphabet_Triangle {
    public static void main(String[] args) {
        Scanner bhan = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = bhan.nextInt();

        for (int i = 1; i <= num; i++){
            for(int j = 1; j <= num+1-i; j++){
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
            bhan.close();
        }
        
    }
    
}
