//           *           
//           *           
//           *           
//           *           
//           *           
// * * * * * * * * * * * 
//           *           
//           *           
//           *           
//           * 

package Pattern_Printing;
import java.util.Scanner;

public class Star_Plus {
    public static void main(String[] args) {
        Scanner raj = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int bhan = raj.nextInt();
        int result = bhan+1;
        int finall = result/2;

        for (int i = 1; i <= bhan; i++){
            for (int j = 1; j <= bhan; j++){
                if(i==finall || j==finall){
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
