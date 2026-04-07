package Arrays;

public class ReverseArr {
    public static void main(String[] args) {
        int [] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int n = arr.length;
        for (int i = 0; i < n/2; i++){
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;

        }
        for (int bhan : arr){
            System.out.print(bhan+" ");
        }
    }
    
}
