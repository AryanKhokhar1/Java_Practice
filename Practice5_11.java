import java.util.Scanner;
public class Practice5_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Suming of n even numbers");
        System.out.print("N: ");
        int num = sc.nextInt();
        int sum = 0;
        for(int i = 0; i<num; i++){
            System.out.println(2*i);
            sum += 2*i;
        }
        System.out.println("Addition of "+num+" even number = "+sum);
    }
}
