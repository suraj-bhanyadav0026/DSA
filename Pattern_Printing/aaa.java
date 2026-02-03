//         * 
//       * * * 
//     * * * * * 
//   * * * * * * * 
// * * * * * * * * * 
//   * * * * * * * 
//     * * * * * 
//       * * * 
//         * 

package Pattern_Printing;
import java.util.Scanner;

public class aaa{
    public static void main(String[] args) {
        Scanner raj = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int bhan = raj.nextInt();
        int space = bhan-1, star = 1; // nsp/nst= number of space/star

        for(int i = 1; i <= bhan;i++){
            for(int j = 1; j <= space; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= star; j++){
                System.out.print("* ");

        }
        space --;
        star +=2;
        System.out.println();
    }
    space =1;
    star = 2 * bhan - 3;

    for(int i = 1; i <= bhan-1;i++){
    for(int j = 1; j <= space; j++){
        System.out.print("  ");
    }
    for(int j = 1; j <= star; j++){
        System.out.print("* ");
    }
    space ++;
    star -=2;
    System.out.println();
    raj.close();
    
}
}
}