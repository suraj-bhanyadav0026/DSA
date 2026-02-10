package Arrays;
import java.util.Scanner;

public class Max_ElementOfArr {
    public static void main(String[] args) {
        Scanner raj = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int bhan = raj.nextInt();

        int arr [] = new int[bhan];
        int max = arr[0];

        for (int i = 0; i <bhan; i++){
            System.out.print("Enter the "+i+"th index element of array: ");
            arr[i] = raj.nextInt();
            if (arr[i]>max){
                max = arr[i];
            }

        }
        System.out.println("the Max number is from array is: " + max);
        raj.close();
    }
}
