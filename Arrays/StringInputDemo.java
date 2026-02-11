package Arrays;
import java.util.Scanner;

public class StringInputDemo {   // ✅ Different name

    public static void main(String[] args) {

        Scanner iam = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int bhan = iam.nextInt();

        String[] arr2 = new String[bhan];  // This now means java.lang.String

        for (int i = 0; i < bhan; i++) {
            System.out.print("Enter the " + i + "th String: ");
            arr2[i] = iam.next();   // ✅ Works perfectly
        }

        System.out.println("\nEntered Strings:");
        for (int i = 0; i < bhan; i++) {
            System.out.println(arr2[i]);
        }

        iam.close();
    }
}
