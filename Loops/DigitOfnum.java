package Loops;
import java.util.Scanner;

public class DigitOfnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter that number for count there digit: ");
        int num = sc.nextInt();
        int count = 0;
        while(num != 0){
        num /= 10;
        count++;
        }
        System.out.println("Digit of number is: "+ count);
        sc.close();

    }

    
}
