import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
        Scanner sccc = new Scanner (System.in);
        System.out.print("Enter a number: ");
        int num = sccc.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " is an Even");
        } else {
            System.out.println(num + " is an Odd");
        }
        sccc.close();
        
        
    }

}
