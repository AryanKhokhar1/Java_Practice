import java.util.Scanner;

public class Practice7_5 {
    static int printfibonaci(int x, int y,int term){
        if(term <= 0){
            return 1;
        }else{
            System.out.print(x+y+", ");
            return printfibonaci(y, x+y, term-1);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Number: ");
        int num = scan.nextInt();
        System.out.print("0, 1, ");
        printfibonaci(0,1,num-2);
    }
}
