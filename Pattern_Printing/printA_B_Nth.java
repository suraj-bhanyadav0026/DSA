package Pattern_Printing;
import java.util.Scanner;

public class printA_B_Nth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to print it till that, in alphabet: ");
        int num = sc.nextInt();
        for (int i = 1; i<= num ; i++){
            for(int j =1; j<= num ; j++){
                System.out.print((char)(j+64)+ " ");
            }
            System.out.println();
            sc.close();
        }
        
    }
    
}
