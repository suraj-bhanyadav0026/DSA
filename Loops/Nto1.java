package Loops;

import java.util.Scanner;

public class Nto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter that number from where to want till zero: ");
        int num = sc.nextInt();
        int i;
        for(i =num; i >=0; i--){
            System.out.println(i);
        }
        sc.close();
    }
    
}
