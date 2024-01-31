import java.util.Scanner;

public class Chapter7_recursion {
    static int factorial(int x){
        if(x== 0 || x == 1){
            return 1;
        }else{
            System.out.println(x);
            return x*factorial(x-1);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Number: ");
        int num = scan.nextInt();
        System.out.println("Factorial of "+num+": "+factorial(num));
    }
}
