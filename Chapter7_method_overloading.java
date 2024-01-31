public class Chapter7_method_overloading {


    // Here x will copy value of a  // so change in x doesn't affect a
    static int Change(int x){ // int x is paramenter 
        x = 45;
        return x;
    }

    // Here num pass reference to arr  // so change in arr reflect to num
    static void Change(int[] arr){
        arr[0] = 34;
    }
    public static void main(String[] args) {
        int a = 89;
        System.out.println("Value of a before runnning change method = "+a);
        Change(a); // In Java it select method automatically based on datatype passed
        System.out.println("Value of a after runnning change method = "+a);
        int[] num = {23, 78, 98}; // Here num store reference / address 
        System.out.println("Value of array 1st element before runnning change method = "+num[0]);
        Change(num); // num is an argument
        System.out.println("Value of array 1st element after runnning change method = "+num[0]);

    }
}
