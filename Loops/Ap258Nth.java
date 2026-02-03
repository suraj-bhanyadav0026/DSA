package Loops;

import java.util.Scanner;

public class Ap258Nth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number till where you want to print AP: ");
        int num = sc.nextInt();
        for(int i = 2; i <= num; i=i+3){
            System.out.println(i);
        }
            sc.close();
    }

    
}
