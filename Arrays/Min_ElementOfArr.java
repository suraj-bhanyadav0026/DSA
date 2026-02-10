package Arrays;
import java.util.Scanner;

public class Min_ElementOfArr{
    public static void main(String[] args) {
        Scanner raj = new Scanner(System.in);
        System.out.print("Enter the Size of Array: ");
        int bhan = raj.nextInt();

        int [] arr = new int[bhan];
        int min = arr[0];
        
        for (int i = 0; i <bhan; i++){
            System.out.print("Enter the " + i+"th index element: ");
            arr[i] = raj.nextInt();
            if (arr[i]<min){
                min=arr[i];
            }

        }
        System.out.println("The min' number from array is: "+min);
        raj.close();
    }

}