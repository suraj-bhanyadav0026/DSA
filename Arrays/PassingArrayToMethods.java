package Arrays;
// import java.util.Scanner;

public class PassingArrayToMethods {
    public static void main(String[] args) {
        int x []= {12, 10, 17, 26, 25};
        System.out.println(x[2]); 
        change(x);
        System.out.println(x[2]); // after changing it
        
    }
    public static void change(int [] x){
        x[2] = 12;
    }
    
}
