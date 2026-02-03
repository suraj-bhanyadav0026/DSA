import java.util.*;
public class ProfitORlose {
    public static void main(String[] args) {
        Scanner ssc = new Scanner(System.in);
        System.out.print("Enter Purchasing price of item: ");
        int Purchase = ssc.nextInt();
        System.out.print("Enter Selling Price of it: ");
        int selling = ssc.nextInt();
        int lose = Purchase - selling;
        int profit = selling - Purchase;
        int nope = selling - Purchase;
        if (Purchase > selling){
             System.out.println("They make lose of: " + lose + " rupees");
        }else{
            System.out.println("They make profit of: " + profit + " rupess");
         
        }
        if(Purchase == selling){
            System.out.println("There is no Profit & No Loseess.." + nope + " rupess");
        }
        ssc.close();

    }
    
}
