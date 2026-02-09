package Arrays;
import java.util.Scanner;


public class NegativeArray {
    public static void main(String[] args) {
        
    Scanner raj = new Scanner(System.in);
    System.out.print("Enter the size of Array: ");
    int bhan = raj.nextInt();

    int [] arr = new int[bhan];

    for(int i = 0; i <bhan; i++){
        System.out.print("Enter the "+i +"th index element: ");
        arr[i] = raj.nextInt();

    }
    System.out.print("Final Negative Array are: ");
    for(int j = 0; j <bhan; j++){
        if(arr[j]<0){
        System.out.print(arr[j]+" ");
        }

    }
    System.out.println();
    raj.close();
    }
    
}

