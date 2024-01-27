public class Practice6_7 {
    public static void main(String[] args) {
        int[] arr = {74, 56, 96, 93, 12, 9, 31, 87};
        int min_num = 2147483647;
        for(int element: arr){
            if(min_num > element){
                min_num = element;
            }
        }
        System.out.println("Maximum number from the array ="+min_num);
    }
}
