import java.util.Scanner;

public class Practice6_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] num = {78, 89, 63, 25, 9, 45};
        System.out.print("Enter a number for check: ");
        int x = scan.nextInt();
        int f = -1;
        for(int n:num){
            if(n == x){
                f = 1;
            }
        }
        if(f == 1){
            System.out.println(x+" present in the array");
        }else{
            System.out.println(x+" don't present in the array");
        }
    }
}
