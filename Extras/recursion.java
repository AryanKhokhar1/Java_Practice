import java.util.*;
public class recursion {
    static int recursion(int num,int mult){
        if(num>0){
            mult = mult * num;
            num--;
            return recursion(num, mult);
        }else{
            return mult;
        }
    }
    public static void main(String[] args){
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = s1.nextInt();
        int mult = 1;
        int result = recursion(num,mult);
        System.out.println("Factorial of "+num+" = "+result);
    }
}
