package Pattern_Printing;
import java.util.Scanner;


public class Odd_Nth_Triangle {
    public static void main(String[] args) {
        Scanner raj = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int bhan = raj.nextInt();


        for(int i = 1; i <=bhan; i++){
            int muse = 1;
            for(int j = 1; j <= i; j++){
                System.out.print(muse+" ");
            muse+=2;

            }
            System.out.println();
            raj.close();
        }
    }
    
}
