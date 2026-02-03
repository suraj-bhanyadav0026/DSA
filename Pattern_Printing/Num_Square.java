package Pattern_Printing;
import java.util.Scanner;

public class Num_Square {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for print there Square: ");
        int num = sc.nextInt();

        for(int i=1; i<=num; i++){
            for(int j=1; j<=num; j++){
            System.out.print(j);
        }
        System.out.println("");
        sc.close();

    }
}
}
