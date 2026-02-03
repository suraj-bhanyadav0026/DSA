// * * * * * * * * * * * 
// *                   * 
// *                   * 
// *                   * 
// * * * * * * * * * * * 

package Pattern_Printing;
import java.util.Scanner;

public class Rectangle_Gap_Star {
    public static void main(String[] args) {
        Scanner raj = new Scanner(System.in);
        System.out.print("Enter the Row: ");
        int row = raj.nextInt();
        System.out.print("Enter the Col: ");
        int col = raj.nextInt();

        for(int i=1;i<=row; i++){
            for(int j=1;j<=col;j++){
                if(i==1 || i==row || j==1 || j==col){
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
