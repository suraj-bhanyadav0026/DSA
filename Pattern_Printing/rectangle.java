package Pattern_Printing;
import java.util.Scanner;

public class rectangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for row of a rectangle: ");
        int row = sc.nextInt();
        System.out.print("Enter the number for column of rectangle: ");
        int col = sc.nextInt();

        for(int i=1; i<=row; i++){
            for(int j=1; j<=col; j++){
                System.out.print("* ");

            }
            System.out.println();
            sc.close();
        }

        
    }
}