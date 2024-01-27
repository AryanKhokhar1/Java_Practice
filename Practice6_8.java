// Check Array sorted or not
public class Practice6_8 {
    public static void main(String[] args) {
        // int[] arr = {74, 56, 96, 93, 12, 9, 31, 87};
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        byte sorted_arr = 1;
        for(int i = 1; i<arr.length; i++){
            if(arr[i-1]> arr[i]){
                sorted_arr = -1;
            }
        }
        if(sorted_arr == -1){
            System.out.println("Given Array isn't sorted");
        }else{
            System.out.println("Given array is sorted");
        }
    }
}
