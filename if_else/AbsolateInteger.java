import java.util.*;

public class AbsolateInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        if (num < 0) num = - num;
        System.out.println("The Absolate Value of Integer is " + num);
        sc.close();
        

    }
    
}
