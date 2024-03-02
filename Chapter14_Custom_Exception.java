
// By use Exception class we can create custom exception for perticular error

import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString() {
        return "I'm to String() method";
    }

    @Override
    public String getMessage() {
        return "getMessage() method is executed";
    }

}

public class Chapter14_Custom_Exception {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Number: ");
        int a = scan.nextInt();
        if(a<5){
            try {
                // throw new MyException();
                throw new ArithmeticException("Number is less than 5");
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e); // When you sout e it will execute toString() method automatically
                e.printStackTrace();
            }
            System.out.println("Resolved! \n\n\n");
        }


        // for Arithmetic Exception
        if(a<10){
            try {
                throw new MyException();
                // throw new ArithmeticException("Number is less than 5");
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e); // When you sout e it will execute toString() method automatically
                e.printStackTrace();
            }
            System.out.println("Resolved! ");
        }
    }
}
