// * * * * *
// * * * *
// * * *
// * * 
// *

package Pattern_Printing;
import java.util.Scanner;
public class Fliped_Triangle {
    public static void main(String[] args) {
        Scanner bhan = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = bhan.nextInt();
        for (int i = 1; i <= num; i++){
            for(int j = 1; j <= num+1-i; j++){
                System.out.print("* ");
            }
            System.out.println();
            bhan.close();
        }
    }
    
}
