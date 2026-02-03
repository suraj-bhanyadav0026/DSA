package Loops;
import java.util.Scanner;

public class GP1_2_4Nth {
    public static void main(String[] args) {
        int a =1, r=2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number till where you want that GP: ");
        int num = sc.nextInt();


        for(int i =1;i<=num; i++){
            System.out.println(a);
            a *=r;
        }
        sc.close();
    }
    
}
