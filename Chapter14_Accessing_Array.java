import java.util.Scanner;

class Chapter14_Accessing_Array {
    public static void main(String[] args) {
        int[] arr = new int[3];
        Scanner scan = new Scanner(System.in);
        arr[0] = 19;
        arr[1] = 23;
        arr[2] = 45;
        while(true){
            try {
                System.out.print("Index: ");
                int i = scan.nextInt();
                System.out.println("Value of array at index "+i+" = "+arr[i]);
                break;
            } catch (Exception e) {
                continue;
            }
        }
        
    }
}