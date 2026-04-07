package Arrays;
import java.util.Arrays;

public class Shallow_DeepCopy {
    public static void main(String[] args) {
        int [] arr = {12, 20, 25,26};
        int [] x = arr; // x is shallow copy of arr
        x[0]=26;
        System.out.println(arr[0]);

        int [] deep = Arrays.copyOf(arr,arr.length);
        deep[0]=99;
        System.out.println(deep[0]); //deep copy
        System.out.println(arr[0]);
        
    }
    
}
