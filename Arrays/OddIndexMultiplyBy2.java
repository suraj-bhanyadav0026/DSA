package Arrays;

public class OddIndexMultiplyBy2 {
    public static void main(String[] args) {

        // Step 1: Declare and initialize the array
        int[] arr = {7, 12, 25, 26, 39, 47, 75, 44};

        // Step 2: Traverse the array using for loop
        for (int i = 0; i < arr.length; i++) {

            // Step 3: Check index condition
            if (i % 2 == 0) {
                // Even index → add 10
                arr[i] = arr[i] + 10;
            } else {
                // Odd index → multiply by 2
                arr[i] = arr[i] * 2;
            }
        }

        // Step 4: Print the modified array
        System.out.println("Updated Array:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}