import java.util.Scanner;

public class Practice5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Suming of n even numbers");
        System.out.print("N: ");
        int num = sc.nextInt();
        int n  = 0;
        while(n<num){
            System.out.println(2*n);
            n++;
        }
    }
}
