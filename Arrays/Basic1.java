package Arrays;

import java.util.Scanner;

public class Basic1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[7];

        for (int j = 0; j < 7; j++) {
            System.out.print("Enter the " + j + "th number to store it in the array: ");
            arr[j] = sc.nextInt();
        }

        System.out.print("Array elements are: ");
        for (int i = 0; i < 7; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
