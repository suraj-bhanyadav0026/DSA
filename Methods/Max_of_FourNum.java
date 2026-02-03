package Methods;
import java.util.Scanner;

public class Max_of_FourNum {
    public static void main(String[] args) {
        Scanner raj = new Scanner(System.in);
        System.out.print("Enter the 1st Number: ");
        int a = raj.nextInt();
        System.out.print("Enter the 2nd Number: ");
        int b = raj.nextInt();
        System.out.print("Enter the 3rd Number: ");
        int c = raj.nextInt();
        System.out.print("Enter the 3rd Number: ");
        int d = raj.nextInt();

        System.out.println(Math.max(Math.max(Math.max(a,b),c),d)+" is Max Num!!");
    raj.close();
    }

    
}
