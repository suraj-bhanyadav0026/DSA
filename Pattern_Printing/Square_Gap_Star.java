// * * * * * 
// *       * 
// *       * 
// *       * 
// * * * * * 

package Pattern_Printing;
import java.util.Scanner;

public class Square_Gap_Star {
    public static void main(String[] args) {
        Scanner raj = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int bhan = raj.nextInt();

        for(int i = 1; i <= bhan; i++){
            for(int j = 1; j <= bhan; j++){
                if( i==1 || i== bhan || j == 1 || j == bhan){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
            raj.close();
        }

    }    
}
