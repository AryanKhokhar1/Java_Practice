import java.util.Scanner;

public class Practice5_4 {
    public static void main(String[] args) {
        System.out.println("Multiplication Table of 10 in reverse order");
        int num = 10;
        for(int i = 10; i>=1; i--){
            System.out.printf("%d x %d = %d",num,i,(num*i));
            System.out.println();
        }
    }
}
