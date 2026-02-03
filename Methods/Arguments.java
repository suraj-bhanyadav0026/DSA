package Methods;

public class Arguments {
    public static void sum(int a, int b) {
        System.out.println(a+b);
        
    }
    public static void sub(int a, int b){
        System.out.println(a-b);
    }
    public static void main(String[] args) {

        sum(7,5);
        mult(13, 2);
        sub(55,30);
        div(49, 7);
        
  
        
    }
    public static void div(int a, int b){
        System.out.println(a/b);
    }
    public static void mult(int a, int b) {
        System.out.println(a*b);
        
    }
}
