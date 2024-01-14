import java.util.*;
public class returning {
    public static void main(String[] args){
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = s1.nextInt();
        int ans = factorial(num);
        System.out.println("Factorial = "+ans);
    }
    static int factorial(int f){
        int mult = 1;
        for(int i = 1; i<=f ; i++){
            mult = mult * i;
        }
        return mult;
    }
}
