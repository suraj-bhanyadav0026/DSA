package Arrays;
import java.util.Scanner;

public class Data_types {
    public static void main(String[] args) {

        Scanner iam = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int bhan = iam.nextInt();

        double[] arr = new double[bhan];
        char[] arr1 = new char[bhan];
        String[] arr2 = new String[bhan];

        // Taking input
        for (int i = 0; i < bhan; i++) {

            System.out.print("Enter the " + i + "th number: ");
            arr[i] = iam.nextDouble();

            System.out.print("Enter the " + i + "th char: ");
            arr1[i] = iam.next().charAt(0);   // ✅ FIXED

            System.out.print("Enter the " + i + "th String: ");
            arr2[i] = iam.next();   // ✅ Works perfectly
        }

        // Printing double array
        System.out.println("\nDouble values:");
        for (int i = 0; i < bhan; i++) {
            System.out.println(arr[i]);
        }

        // Printing char array
        System.out.println("\nChar values:");
        for (int i = 0; i < bhan; i++) {
            System.out.println(arr1[i]);
        }
                System.out.println("\nEntered Strings:");
        for (int i = 0; i < bhan; i++) {
            System.out.println(arr2[i]);
        }

        iam.close();
    }
}
