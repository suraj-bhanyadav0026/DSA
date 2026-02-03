package Methods;

public class Arguments1 {
    public static void max(int a, int b) {
        System.out.println(Math.max(a,b));
        
    }

    public static void main(String[] args) {
        max2(54,65,34,78,32);
        max(53,56);
        max1(4334,354,5332);
     
        


    }
    public static void max1(int a, int b, int c) {
        System.out.println(Math.max(Math.max(a,b),c));
        
    }
    public static void max2(int a, int b,int c, int d,int e) {
        System.out.println(Math.max(Math.max(Math.max(Math.max(a,b),c),d),e));
        
    }
    
}
