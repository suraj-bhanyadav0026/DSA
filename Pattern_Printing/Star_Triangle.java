package Pattern_Printing;
import java.util.Scanner;

public class Star_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num to print triagnle: ");
        int num = sc.nextInt();

        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
            sc.close();
        }
    }

    
}
