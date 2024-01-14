import java.util.Scanner;

public class Validity {
    public static void main(String[] args) {
        System.out.println("Checking validity of Input field using scanner :");
        System.out.print("Proved a number for checking int vaidity :");
        Scanner s1 = new Scanner(System.in);
        boolean validityCheck = s1.hasNextInt();
        System.out.println("Validity of Input field as Integer : "+validityCheck);
    }
}
