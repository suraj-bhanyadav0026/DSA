package Arrays;
import java.util.Scanner;

public class Charr {
    public static void main(String[] args) {
        Scanner iam = new Scanner(System.in);

        System.out.print("Enter the size of Array: ");
        int bhan = iam.nextInt();

        char[] arr = new char[bhan];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter " + i + "th char: ");
            arr[i] = iam.next().charAt(0);  // Always take first character
        }

        System.out.println("Entered characters are:");
        for (int i = 0; i < bhan; i++) {
            System.out.print(arr[i] + " ");
        }

        iam.close();
    }
}
