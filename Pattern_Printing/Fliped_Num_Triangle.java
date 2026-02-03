// 1 2 3 4 5 
// 1 2 3 4
// 1 2 3 
// 1 2 
// 1

package Pattern_Printing;
import java.util.Scanner;

public class Fliped_Num_Triangle {
    public static void main(String[] args) {
        Scanner bhan = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int num = bhan.nextInt();


        for(int i =1; i <= num; i++){
            for(int j = 1; j<= num+1-i; j++){
                System.out.print(j+ " ");
            }
            System.out.println();
            bhan.close();
        }
    }
    
}
