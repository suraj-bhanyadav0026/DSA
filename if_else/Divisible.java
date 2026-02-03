import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Nominator: ");
        int nominator = sc.nextInt();

        System.out.print("Enter a Dominator: ");
        int dominator = sc.nextInt();

        // Check divisibility using modulus operator
        if (nominator % dominator == 0) {
            System.out.println("It is divisible by " + dominator);
        } else {
            System.out.println("It is not divisible");
            System.out.println("The Result is: " + (nominator / dominator));
        }

        sc.close();
    }
}
