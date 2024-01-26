import java.util.Scanner;

public class Practice5_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Multiplication Table");
        System.out.print("N: ");
        int num = sc.nextInt();
        for(int i = 1; i<=10; i++){
            System.out.printf("%d x %d = %d",num,i,(num*i));
            System.out.println();
        }
    }
}
