import java.util.*;
public class greatestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter tha 1st Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the 2nd Number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the 3rd Number: ");
        int num3 = sc.nextInt();
        if (num1 > num2 && num1> num3){
            System.out.println("The Greatest of Three number is: " + num1);
        } else if ( num2 > num1 && num2 > num3){
            System.out.println("The Greatest of three number is "+ num2);
        } else if (num3> num1 && num3 > num2){
            System.out.println("The Greatest of three number is " + num3);
        }else if (num1 == num2 && num3 > num1){
            System.out.println("The Greatest of there number is: "+ num3);
        }else if(num2 == num3 && num1 > num2){
            System.out.println("The Greatest of three number is: "+ num1);
        }else if(num1 == num3 && num2 > num3){
            System.out.println("The Greatest of three number is: "+ num2);
        //here
        }else if (num1 == num2 && num3 < num1){
            System.out.println("The Greatest of there number is: "+ num1);
        }else if(num2 == num3 && num1 < num2){
            System.out.println("The Greatest of three number is: "+ num2);
        }else if(num1 == num3 && num2 < num3){
            System.out.println("The Greatest of three number is: "+ num3);
        }else{
            System.out.println("All three numbers are Equals ");
        }
        sc.close();


    }
    
}
