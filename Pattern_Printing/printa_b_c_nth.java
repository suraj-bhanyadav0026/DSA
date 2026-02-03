package Pattern_Printing;
import java.util.Scanner;

public class printa_b_c_nth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to print it in lower case in alphabet: ");
        int num = sc.nextInt();

        for(int i = 1; i<=num;i++){
            for(int j = 1; j <=num; j++){
                System.out.print((char)(j+96)+ " ");
            }
            System.out.println();
            sc.close();
        }
    }

    
}
