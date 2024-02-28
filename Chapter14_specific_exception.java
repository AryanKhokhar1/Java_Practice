import java.util.InputMismatchException;
import java.util.Scanner;

public class Chapter14_specific_exception {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try{
            int a = 4;
            int b = 0;
            System.out.println(a/b);
        }catch(InputMismatchException e){
            System.out.println("Please provide integer value");
        }catch(ArithmeticException e){
            System.out.println("A number can't be divided by 0");
        }catch(Exception e){
            System.out.println("Error: "+e);
        }
    }
}
