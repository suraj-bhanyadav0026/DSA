package Pattern_Printing;
import java.util.Scanner;

public class Odd_Num_Triangle {
    public static void main(String[] args) {
        Scanner raj = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int bhan = raj.nextInt();

        for (int i = 1; i <= bhan; i++){
            for (int j = 1; j <= i; j++){
                if(i%2!= 0 && j%2!=0){
                System.out.print(j+" ");
            }
 
        }
                   System.out.println();
            raj.close();
    }   
}
}
