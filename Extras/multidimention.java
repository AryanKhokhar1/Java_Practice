import java.util.Scanner;
public class multidimention{
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter the rows =");
        int row = s1.nextInt();
        System.out.print("Enter the columns =");
        int columns = s1.nextInt();
        String arr[] = new String[row];
        for(int i = 0; i<row; i++) {
            System.out.print("Enter elements = ");
            arr[i] = s1.nextLine();
            arr.flush();
        }
        for(String s:arr){
            System.out.println(s);
        }
    }
}