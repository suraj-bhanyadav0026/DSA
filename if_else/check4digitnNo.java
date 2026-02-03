import java.util.*;
public class check4digitnNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        if ( num > 999 && num <= 9999){
            System.out.println("Yes it's is a 4 digit number: " + num);
        }else{
            System.out.println("No " + num + " is not a 4 digit number");
        }
        sc.close();
    }
    
}
