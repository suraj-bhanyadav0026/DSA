package Arrays;

public class ReverseMidArr {
    public static void main(String[] args) {
        int [] arr = {21, 43, 56, 42, 87, 78, 23, 74, 28, 64};
        int n = arr.length;
        int i =2, j=5; // index number of that for mid element;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int s = 0; s<n;s++){
            System.out.print(arr[s]+" ");
        }



    }
    
}
