import java.util.*;
public class divisiblebyN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter That 1st Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter that 2nd Number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the number for that divisibility check: ");
        int num = sc.nextInt();
        if ( num % num1 == 0 || num % num2 == 0){
            System.out.println("The Number is divisible by Either " + num1 + " or " + num2);
            
        }else{
            System.out.println("The number is not divisible by Either " + num1 + " or " + num2);
        }
        sc.close();
    }
    }