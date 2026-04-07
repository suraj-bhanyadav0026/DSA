package Arrays;
import java.util.Scanner;

public class SearchinArray {
    public static void main(String[] args) {

        Scanner raj = new Scanner(System.in);
        System.out.print("Enter that number that we want to search it in Array: ");
        int target = raj.nextInt();

        int[] arr = {7, 12, 25, 26, 39, 47, 75, 44};
        boolean flag = false; // here i am take like element does not found in Array
        for (int i = 0; i <arr.length;i++){
            if (target==arr[i]){
                flag=true;
                break;

        }


    }
    if(flag==true){
        System.out.println("Yes "+ target+" Found in Array");

    }else{
        System.out.println("No "+target+" Does not found in Array ");
    }
    raj.close();
}
}