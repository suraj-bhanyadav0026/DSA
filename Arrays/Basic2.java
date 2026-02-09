package Arrays;
import java.util.Scanner;

public class Basic2 {
    public static void main(String[] args) {
        Scanner raj = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int bhan = raj.nextInt();

        int [] arr = new int [bhan];

        for(int j=0; j< bhan; j++){
        System.out.print("Enter the "+ j +"th index element: ");
        arr [j] = raj.nextInt();
        }

        System.out.print("Final array is: ");
        for (int i = 0; i < bhan; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        raj.close();


    }
    
}
