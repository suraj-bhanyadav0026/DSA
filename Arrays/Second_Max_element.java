package Arrays;

public class Second_Max_element {
    public static void main(String[] args) {
        int [] arr = { 12, 26, 7, 9, 5, 2, 8, 11, 12 };
        int max = Integer.MIN_VALUE;
        int Secmax = Integer.MIN_VALUE;

        for(int  i= 0; i<arr.length;i++){
            if(arr[i]>max) max = arr[i];
            System.out.print(arr[i]+" ");

        }
        for(int  i= 0; i<arr.length;i++){
            if(arr[i]>Secmax && arr[i] != max) Secmax = arr[i];

        }
        System.out.println();
        System.out.println("Second Max element in given array is: "+ Secmax);

        

    }
    
}
