import java.util.Scanner;

public class Practice1_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for integer check: ");
        boolean num = sc.hasNextInt();
        if(num == true){
            System.out.println("\nIt's an Integer");
        }else{
            System.out.println("\nIt's not an Integer");
        }

    }
}
