// * * * * * 
// * * * * 
// * * * 
// * * 
// * 

package Pattern_Printing;
import java.util.Scanner;

public class Fliped_star_Triangle {
    public static void main(String[] args) {
        Scanner bhan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = bhan.nextInt();
        int result = num;

        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= result; j++){
                System.out.print("* ");
            }
            result--;
            System.out.println();
            bhan.close();
        }
    }
    
}
