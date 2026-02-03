// 1 
// 2 3 
// 4 5 6 
// 7 8 9 10 
// 11 12 13 14 15 
// 16 17 18 19 20 21 
// 22 23 24 25 26 27 28 

package Pattern_Printing;
import java.util.Scanner;


public class Counting_Triangle {
    public static void main(String[] args) {
        Scanner raj = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int bhan = raj.nextInt();
        int result = 1;

        for (int i = 1; i <= bhan; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(result + " ");
                result++;
            }

            System.out.println();
            raj.close();
        }

    }
    
}
