
import java.util.Scanner;
public class Add_Three_Number {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("First Number: " );
        int a = s1.nextInt();
        System.out.print("Second Number: " );
        int b = s1.nextInt();
        System.out.print("Third Number: " );
        int c = s1.nextInt();
        System.out.print("Sum = "+(a+b+c));
    }
}
