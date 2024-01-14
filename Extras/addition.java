import java.util.Scanner;

public class addition {
    double total(double num1, double num2){
        return num1 + num2;
    }
    public static void main(String[] args){
        addition obj = new addition();
        Scanner s = new Scanner(System.in);
        System.out.println("Addition of two number");
        System.out.print("1st Number : ");
        double a1 = s.nextDouble();
        System.out.print("2nd Number : ");
        double a2 = s.nextDouble();
        s.close();
        double sum = obj.total(a1, a2);
        System.out.println("Sum = "+sum);
    }
}
