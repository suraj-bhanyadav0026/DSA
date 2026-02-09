package Arrays;
import java.util.Scanner;

public class ProductOfArray {
    public static void main(String[] args) {
        Scanner raj = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int bhan = raj.nextInt();

        int [] arr = new int[bhan];
        int product =1;

        for(int i = 0; i<bhan;i++){
            System.out.print("Enter the "+i+"th index element of Array: ");
            arr[i] = raj.nextInt();
            product *= arr[i];
        }
        System.out.println("The product of give array is: "+product);
        raj.close();


    }
    
}
