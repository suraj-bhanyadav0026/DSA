package Arrays;

public class Basic {
    public static void main(String[] args) {
        int [] student = {12, 26, 44, 54, 67, 75, 97};
        System.out.println(student[1]);
        student [2] = 49;
        System.out.println(student[2]);

        int [] student1 = new int [4];
        student1[0] = 43;
        student1[1] = 75;
        student1[2] = -23;
        student1[3] = 98;

        System.out.println(student1[2]);
        System.out.println(student1[3]);
        //but if we want to print whole array for that-
        for (int i =0; i<= 3;  i++){
                System.out.print(student1[i]+" ");
            }
            System.out.println();
            int i =0;

        while (i<= 3){
            System.out.print(student1[i]+" ");
            i++;
        }
         
    }
    
}
