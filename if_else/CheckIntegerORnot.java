import java.util.*;
public class CheckIntegerORnot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Integer: ");
        double num = sc.nextDouble();
        int result = (int)num;
        if(num - result > 0){
        System.out.println("It's Not A Integer");
    }else{
        System.out.println("It's A Integer");
    }
    sc.close();
}
}  
 