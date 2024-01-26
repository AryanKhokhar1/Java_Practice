import java.util.Scanner;

public class Chapter5_first_odd_number {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Num: ");
        int last_num = sc.nextInt();
        for(int i =0; i<last_num; i++){
            System.out.println(2*i+1);
        }
    }
}
