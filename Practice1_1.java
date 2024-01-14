import java.text.DecimalFormat;
import java.util.Scanner;

public class Practice1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number 1st: ");
        double num1 = sc.nextDouble();
        System.out.print("Number 2nd: ");
        double num2 = sc.nextDouble();
        System.out.print("Number 3rd: ");
        double num3 = sc.nextDouble();
        
        double sum = num1 + num2 + num3;
        DecimalFormat numberFormater = new DecimalFormat("#.00");
        System.out.println("Sum: " + numberFormater.format(sum));
    }
}
