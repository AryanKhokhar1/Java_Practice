// Converting string into lower case
import java.util.Scanner;
public class Practice3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name = sc.nextLine();
        name = name.toLowerCase();
        System.out.printf("Hii, %s",name);
    }
}
