// 1 
// 0 1 
// 1 0 1 
// 0 1 0 1 
// 1 0 1 0 1 
// 0 1 0 1 0 1 
// 1 0 1 0 1 0 1

package Pattern_Printing;
import java.util.Scanner;

public class Binary_Triangle {      
    public static void main(String[] args) {
        Scanner raj = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int bhan = raj.nextInt();

        for (int i = 1; i <= bhan; i++){
            for(int j = 1; j <= i; j++){
                if ( i==j || (i+j) % 2== 0){
                    System.out.print(1+ " ");
                }else{
                    System.out.print(0+ " ");
                }

            }
            raj.close();
            System.out.println();            
        }
    }
    
}
