import java.util.Scanner;
public class Factorial {
    static Integer facrec(int num,int mult){
        if(num == 1){
            return mult;
        }else{
            mult = mult * num;
            return facrec(num-1, mult);
        }
    }
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter a Number = ");
        Integer num = s1.nextInt();
        System.out.print("Enter a Number for operation\n1.Factorial Using Recursion\n2.Factorial using Iteration = ");
        Integer op = s1. nextInt();
        if(op == 1){
            Integer ans = facrec(num, 1);
            System.out.printf("Factorial of %d = %d",num,ans);
        }else if(op == 2){
            Integer fact = 1;
            for(int i = 1;i<=num; i++){
                fact = fact * i;
            }
            System.out.printf("Factorial of %d = %d",num,fact);
        }
    }
}
