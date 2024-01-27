// Maximum from the Array
public class Practice6_6 {
    public static void main(String[] args) {
        int[] arr = {74, 56, 96, 93, 12, 9, 31, 87};
        int max_num = -2147483648;
        for(int element: arr){
            if(max_num < element){
                max_num = element;
            }
        }
        System.out.println("Maximum number from the array ="+max_num);
    }
}
