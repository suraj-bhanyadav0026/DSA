package Arrays;
import java.util.Scanner;

public class SumOfArr {
    public static void main(String[] args) {
        Scanner raj = new Scanner(System.in);
        System.out.print("Enter the Size of Array: ");
        int bhan = raj.nextInt();

        int [] arr = new int[bhan];
        int sum=0;

        for (int i = 0; i < bhan; i++){
            System.out.print("Enter the "+i+"th index element: ");
            arr[i] = raj.nextInt();
            sum += arr[i];
        }
        System.out.print("Sum of array is: "+sum);
        System.out.println();
        raj.close();


    }
    
}
