package Methods;

public class function_calling {
    public static void raj() {
    System.out.println("it run raj function");
    System.out.println("Shubham Raj");

    
}
public static void bhan() {
    System.out.println("it run bhan function");
    System.out.println("Suraj Bhan");
    
}


    public static void main(String[] args) {
        System.out.println("This this main function: ");
        shrishti();



        
    }


    public static void shrishti(){
    System.out.println("it run shrishti function");
    System.out.println("Shrishti Verma");
    raj();
    suraj();
    bhan();
    muse();

    }
    public static void muse(){
    System.out.println("it run muse function");
    System.out.println("muse mera beta");        

    }
    public static void suraj() {
    System.out.println("it run suraj function"); 
    System.out.println("Suraj bhan yadav");       
        
    }
    
}
