package Pattern_Printing;
import java.util.Scanner;

public class Number_Spiral {
    public static void main(String[] args) {
        Scanner raj = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int bhan = raj.nextInt();


        for(int i = 1; i <= 2*bhan-1; i++){
            for(int j = 1; j <= 2*bhan-1; j++){
                int row=i,col=j;
                if(i>bhan) row = 2 * bhan - i;
                if(j>bhan) col = 2 * bhan - j;
                System.out.print(Math.min(row,col)+" ");
            }
            System.out.println();
        }
        raj.close();
    }
    

}
