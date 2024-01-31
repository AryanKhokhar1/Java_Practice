import java.util.Scanner;

public class Chapter7_Fibonacci_recursion {
    static int fibonacci(int x){
        if(x == 1){
            return 0;
        }else if(x == 2){
            return 1;
        }else{
            return fibonacci(x-1) + fibonacci(x-2);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("nth term: ");
        int term = scan.nextInt();

        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89... 
        System.out.println("Fibonacci "+term+"th term nummber: "+fibonacci(term));
    }
}
