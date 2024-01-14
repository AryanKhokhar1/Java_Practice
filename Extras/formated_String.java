import java.util.Scanner;
public class formated_String {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter a Number = ");
        Integer i1 = s1.nextInt();
        System.out.printf("Enter Number = %d",i1);
    }
}
