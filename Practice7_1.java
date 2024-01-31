import java.util.Scanner;

public class Practice7_1 {
    static int Multiplication_table(int x,int i){
        if(i > 10){
            return 1;
        }
        System.out.printf("%d x %d = %d\n",x,i,x*i);
        return Multiplication_table(x, i+1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Number: ");
        int number = scan.nextInt();
        Multiplication_table(number,1);
    }
}
