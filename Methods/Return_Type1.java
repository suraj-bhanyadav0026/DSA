package Methods;

public class Return_Type1 {

    public static int raj(int a) {
        System.out.println("Shubham Raj");
        
        if (a>0) return 12;
        else return 26;
        }

        
    public static void main(String[] args) {
        raj(26);
        int x = raj(7);
        System.out.println(x);// here 1st it run function raj(); than print shubham raj than check for return. which is-
        // writtern in if condition than here it is 7 so that is bigger than 0 so it print 12 than add 0 in it than print 12..
        int y = raj(-7);
        System.out.println(13+y); // here 1st it run function raj(); than print shubham raj than check for return which is- 
        // writtern in if condition than here it is -7 that in less than 0 so it print 26 than add 13 in it than print 39..

        
    }
    
}
