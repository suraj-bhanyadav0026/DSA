// A
// B B
// C C C
// D D D D nth
package Pattern_Printing;
import java.util.Scanner;
public class Alphabet_Triangle {
    public static void main(String[] args) {
        Scanner motu = new Scanner(System.in);
        System.out.print("Enter the number to print Alphabet in triangle form: ");
        int num = motu.nextInt();

        for (int i =1; i<=num; i++){
            for(int j=1; j<=i; j++){
                System.out.print((char)(i+64)+" ");
            }
            System.out.println();
            motu.close();
        }

    }
    
}
