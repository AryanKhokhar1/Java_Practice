import java.util.Scanner;

public class Chapter5_natural_number {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("n: ");
        byte last_num = sc.nextByte();
        int num = 1;
        do{
            System.out.println(num);
            num++;
        }while(num<=last_num);
    }
}
