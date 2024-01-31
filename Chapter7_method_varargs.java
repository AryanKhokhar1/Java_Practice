/**
 * Chapter7_method_varargs 
 */


public class Chapter7_method_varargs {
    
    // Here are variable argument not defined number of argument
    static int sum(int ...arr){ // It store argument into an array named as arr
        int result = 0;
        for(int element: arr){
            result += element;
        }
        return result;
    }

    // Here we define one argument is must
    static int sum_oneargismust(int x, int ...arr){
        int result = x;
        for(int element: arr){
            result += element;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("The sum of 2 and 3: "+sum_oneargismust(2,3));
        System.out.println("The sum of 2 and 3: "+sum(2,3));
        System.out.println("The sum of 2,4 and 3: "+sum(2,4,3));
        System.out.println("The sum of 2,4,5 and 3: "+sum(2,4,5,3));
        System.out.println("The sum of 2,4,5,6 and 3: "+sum(2,4,5,6,3));

    }
}