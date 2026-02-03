// *       * 
//   *   *   
//     *     
//   *   *   
// *       * 

package Pattern_Printing;
import java.util.Scanner;

public class Star_Cross {
    public static void main(String[] args) {
        Scanner raj = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int bhan = raj.nextInt();

        for(int i = 1; i <= bhan; i++){
            for (int j = 1; j <= bhan; j++){
                if(i==j || j==i){
                    System.out.print("* ");
                } else if(i+j==bhan+1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            raj.close();
            System.out.println();
        }
    }
    
}
