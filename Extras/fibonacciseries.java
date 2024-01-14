import java.util.Scanner;

class fibonacciseries{
    void printFibonacci(int a, int b, int n){
        int c = a + b;
        if (n <=0 ) {
            return;
        }
        System.out.println(c);
        printFibonacci(b, c, n-1);
    }
    public static void main(String[] args) {
        System.out.println("Running Fibonacci Series");
        fibonacciseries fs = new fibonacciseries();
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the Series length: ");
        int n = s1.nextInt();
        s1.close();
        int a = 0;
        int b = 1;
        System.out.println("Fibonacci Series:\n"+a+"\n"+b);
        fs.printFibonacci(a,b,n-2);
    }
}