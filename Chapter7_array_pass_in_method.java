public class Chapter7_array_pass_in_method {


    // Here x will copy value of a  // so change in x doesn't affect a
    static int Changeint(int x){
        x = 45;
        return x;
    }

    // Here num pass reference to arr  // so change in arr reflect to num
    static void Changearray(int[] arr){
        arr[0] = 34;
    }
    public static void main(String[] args) {
        int a = 89;
        System.out.println("Value of a before runnning change method = "+a);
        Changeint(a);
        System.out.println("Value of a after runnning change method = "+a);
        int[] num = {23, 78, 98};
        System.out.println("Value of array 1st element before runnning change method = "+num[0]);
        Changearray(num);
        System.out.println("Value of array 1st element after runnning change method = "+num[0]);

    }
}
