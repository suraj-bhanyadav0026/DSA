// 1
// A B
// 1 2 3
// A B C D
// 1 2 3 4 5 
// A B C D E F 
package Pattern_Printing;
import java.util.Scanner;

public class Alphabet_digit_Triagnle {
    public static void main(String[] args) {
        Scanner motuu = new Scanner(System.in);
        System.out.print("Enter the number to print Triangle: ");
        int num = motuu.nextInt();

        for (int i = 1; i <= num; i++){
            for(int j = 1; j<= i; j++){
                if(i%2==0){
                    System.out.print((char)(j+64)+ " ");
                }else{
                    System.out.print(j+" ");
                }
                motuu.close();
            }
            System.out.println();
        }
    }
    
}
