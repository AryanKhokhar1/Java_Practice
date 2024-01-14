import java.util.Scanner;

public class election {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter your age =");
        int age = s1.nextInt();
        if(age<18){
            throw new ArithmeticException("Denied! You are not 18+");
        }else{
            System.out.println("You can vote");
        }
    }
}
