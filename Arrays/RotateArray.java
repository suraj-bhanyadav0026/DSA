package Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {12, 54, 76, 32, 96, 84, 69};
        int k = 2; // number of rotations

        RotateArray obj = new RotateArray();
        int n = arr.length;

        k = k % n;

        // Step 1: reverse whole array
        obj.reverse(arr, 0, n - 1);

        // Step 2: reverse first k elements
        obj.reverse(arr, 0, k - 1);

        // Step 3: reverse remaining elements
        obj.reverse(arr, k, n - 1);

        // Print result
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];   // ✅ fixed
            arr[j] = temp;     // ✅ fixed
            i++;
            j--;
        }
    }
}