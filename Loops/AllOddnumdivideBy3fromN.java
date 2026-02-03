package Loops;

import java.util.Scanner;

public class AllOddnumdivideBy3fromN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter that number till where you want to print Divisible of 3: ");
        int num = sc.nextInt();
        for (int i=1; i<=num; i=i+2){
            if(i %3 ==0){
                System.out.println(i);
            }
        }
        sc.close();
    }
    
}
