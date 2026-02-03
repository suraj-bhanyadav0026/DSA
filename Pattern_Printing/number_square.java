package Pattern_Printing;
import java.util.Scanner;

public class number_square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for print there square: ");
        int num = sc.nextInt();
        for(int i = 1; i <= num; i++){
            for (int j = 1; j <= num; j++){
            System.out.print(i);
        }
        System.out.println();
        sc.close();
    }
    
}
}