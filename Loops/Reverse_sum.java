package Loops;
import java.util.Scanner;

public class Reverse_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number that you want to print there sum and reverse both: ");
        int num = sc.nextInt();
        int sum = 0;
        int reverse = 0;
        while ( num != 0){
            sum += num%10;
            reverse *= 10;
            reverse += (num%10);
            num /= 10;

        }
        System.out.println( "Reverse of number is: " + reverse + " And Sum of Number is: " + sum  );
        sc.close();
    }
    
}