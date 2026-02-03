import java.util.*;
public class checkForQuadrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value of X: ");
        int x = sc.nextInt();
        System.out.print("Enter the Value of Y: ");
        int y = sc.nextInt();
        if ( x > 0 && y> 0){
            System.out.println(" lies in 1st Quadrant");
        } else if( x < 0 && y < 0){
            System.out.println(" lies in 3rd Quadrant");
        } else if( x > 0 && y < 0 ){
            System.out.println(" lies in 4th Quadrant");
        } else if( x < 0 && y > 0){
            System.out.println(" lies in 2nd Quadrant");
        } else if(x ==0 && y == 0){
            System.out.println(" Lies on origin");
        } else if (x== 0 && y != 0){
            System.out.println(" lies on Y Axis ");
        } else{
            System.out.println(" lies on X Axis ");
        }
        sc.close();  
    }
    
}
