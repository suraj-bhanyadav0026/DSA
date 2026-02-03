//a a a a nth
//B B B B nth
//c c c c nth
//D D D D nth
package Pattern_Printing;
import java.util.Scanner;

public class printaaa_BBB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter that nth number: ");
        int num = sc.nextInt();

        for(int i = 1; i <= num; i++){
            for(int j=1; j<= num; j++){
                if(i%2==0){
                System.out.print((char)(i+64)+ " ");
            }else{
                System.out.print((char)(i+96)+ " ");
            }
           System.out.print(" ");
           sc.close();

            
        }
        System.out.println();


    }
    
}
}
