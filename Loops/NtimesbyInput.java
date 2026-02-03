package Loops;

import java.util.Scanner;

public class NtimesbyInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number, that much times you want to print it: ");
        int num = sc.nextInt();
        int i;
        for(i =1; i <= num; i++){
            System.out.println("(" + i + ") "+ "suraj bhan");
        }
        sc.close();
    }
    
}
