import java.util.Scanner;

import Practice12_1.ScCalculator;

class MaxLimitReached extends Exception{
    @Override
    public String toString() {
        return "You pass max limit of retries";
    }
    @Override
    public String getMessage() {
        return "5 Retries completed";
    }
}

public class Practice14_5 {
    static void accessingArray(int[] arr) {
        int n = 0;
        Scanner scan = new Scanner(System.in);
        for(int i =0; i<5; i++){
            try{
                System.out.print("Index: ");
                int index = scan.nextInt();
                System.out.printf("Value of %d index in Array : %d\n",index,arr[index]);
                break;
            }
            catch(Exception e){
                if(n == 4){
                    System.out.println("Error");
                    return ;
                }
                n++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        accessingArray(arr);
    }
}
