import java.util.Scanner;


public class Practice14_1 {
    static int add(int a , int b){
        return a-b; // logical error
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 5;
        // intt b = 6; Syntax error
        int b = 0;
        try{
            System.out.printf("Division of %d and %d : %d", a,b,(a/b));
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Addition of 2, 4 :"+add(2,4));

    }
}
