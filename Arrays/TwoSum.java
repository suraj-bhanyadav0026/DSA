package Arrays;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner raj = new Scanner(System.in);
        System.out.print("Enter that number for founding there sum: ");
        int Target = raj.nextInt();

        int[] arr = {2, 4, 7, 9, 5, 8, 3};
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == Target) {
                    System.out.println("Found: " + arr[i] + " + " + arr[j] + " = " + Target);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("No pair found");
        }
        raj.close();
    }
}