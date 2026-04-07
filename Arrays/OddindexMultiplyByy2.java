package Arrays;

public class OddindexMultiplyByy2 {
    public static void main(String[] args) {
        int [] arr = {3, 6, 4, 8, 9, 1, 8, 2, 4, 6, 9};

        for(int i = 0; i<arr.length;i++){
            if(i%2==0){
                arr[i]+= 10;
            }else{
                arr[i] *= 2;
            }
        }
        print(arr);
        
    }
    public static void print(int arr[]) {
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
        
    }
    
}
