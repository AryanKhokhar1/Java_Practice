import java.util.Scanner;

public class Practice14_3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i<5; i++){
            try{
                System.out.print("Index: ");
                int index = scan.nextInt();
                System.out.printf("Value of %d index in arr Array: %d\n",index,arr[index]);
                break;
            }catch(Exception e){

            }
        }
    }
}
