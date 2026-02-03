package Loops;

import java.util.Scanner;

public class Reverse_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for print there reverse: ");
        int num = sc.nextInt();
        int reverse = 0;
        while( num != 0 ){
            reverse *= 10;
            reverse += (num%10);
            num /= 10;
        }
        System.out.println("Reverse of digit is : "+ reverse);
        sc.close();

    }
    
}
