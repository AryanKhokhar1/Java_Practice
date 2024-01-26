import java.util.Scanner;

class Practice5_5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Factorial Num: ");
        int num = sc.nextInt();
        long factorial = 1;
        for(int i = num; i>=1; i--){
            factorial *= i;
        }
        System.out.println("Factorial of "+num+" = "+factorial);
    }
}