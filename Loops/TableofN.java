package Loops;

import java.util.Scanner;

public class TableofN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter that number which you want to print Table of it: ");
            int num = sc.nextInt();

        for (int i =1; i<=10; i++){
            System.out.println(i*num);
        }
            sc.close();
    }

    
}
