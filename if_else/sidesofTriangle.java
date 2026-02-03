import java.util.*;
public class sidesofTriangle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first side of the triangle: ");
        int a = sc.nextInt();
        System.out.print("Enter the second side of the triangle: ");
        int b = sc.nextInt();
        System.out.print("Enter the third side of the triangle: ");
        int c = sc.nextInt();
        if ( a+b > c && a+c > b && b+c > a ){
            System.out.print("Yes it is a valid Triangle: ");
        }else{
            System.out.print("Not a valid Triangle: ");
            System.out.print("The sum of two sides must be greater than the third side");
            
        }
        sc.close();



    }
    }
