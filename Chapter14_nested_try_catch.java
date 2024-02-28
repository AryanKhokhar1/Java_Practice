import java.util.Scanner;

public class Chapter14_nested_try_catch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            int a = scan.nextInt();
            int b = scan.nextInt();
            try {
                System.out.println("Result: "+ a/b);
            } catch (ArithmeticException e) {
                System.out.println("A number can't be divided by 0");
                System.out.println("Exception in level 1");
            }
        } catch (Exception e) {
            System.out.println("Error: "+e);
            System.out.println("Exception in level 2");
        }
    }
}
