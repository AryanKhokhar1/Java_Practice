import java.util.Scanner;

public class Practice5_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Factorial Num: ");
        int num = sc.nextInt();
        long factorial = 1;
        int n = num;
        while(n>=1){
            factorial *=n;
            n--;
        }
        System.out.println("Factorial of "+num+" = "+factorial);
    }
}
