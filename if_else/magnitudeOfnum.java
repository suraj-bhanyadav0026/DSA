import java.util.*;
public class magnitudeOfnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int num = sc.nextInt();
        int num1;
        num1 = num;
        System.out.print("Enter the Magnitude value: ");
        int Magnitude = sc.nextInt();
        if (num < 0) num = - num;
        System.out.println("Absoulte value of " + num1 + " is " + num);
if (num == Magnitude) {
    System.out.println("The number " + num + " is equal to the magnitude that is " + Magnitude);
} else {
    if (num < Magnitude) {
        System.out.println("The number " + num + " is less than the magnitude that is " + Magnitude);
    } else {
        System.out.println("Number is bigger than Magnitude: ");
    }
}
        sc.close();
        
        
    }
}
