// Detect double and triple spaces

public class Practice3_4 {
    public static void main(String[] args) {
        String test_string = "This string contain double    and triple spaces     ";
        if(test_string.indexOf("  ") != -1){
            System.out.println("This String contain double Spaces");
        }else{
            System.out.println("This String doesn't contain double Spaces");
        }
        if(test_string.indexOf("   ") != -1){
            System.out.println("This String contain Triple Spaces");
        }else{
            System.out.println("This String doesn't contain Triple Spaces");
        }
    }
}
