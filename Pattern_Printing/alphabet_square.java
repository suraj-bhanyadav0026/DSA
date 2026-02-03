package Pattern_Printing;
import java.util.Scanner;

public class alphabet_square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for print it in alphabet in square form: ");
        int num = sc.nextInt();

        for(int i = 1; i <= num ; i++){
            for(int j = 1; j <= num ; j++){
                System.out.print((char)(i + 64 ) + " ");
            }
            System.out.println();
            sc.close();
        }
    }
    
}
