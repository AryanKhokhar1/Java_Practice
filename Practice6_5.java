// Array in Reverse Order
public class Practice6_5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Array in reverse order!");
        for(int i = arr.length-1; i>=0; i--){
            System.out.println(arr[i]);
        }
    }
}
