import java.util.Scanner;

import javax.security.auth.Subject;

class Multiplyinput extends Exception{
    @Override
    public String toString() {
        return "Multiplication input can't more than 7000 ";
    }
}
class invalidInput extends Exception{
    @Override
    public String toString() {
        return "You can't pass 8,9 as input";
    }
}
class MaxInput extends Exception{
    @Override
    public String toString() {
        return "Maximum input can't over 100000";
    }
    @Override
    public String getMessage() {
        return "Maximum input can't over 100000";
        
    }
}
class CannotDividebyZero extends Exception{
    @Override
    public String toString() {
        return "Can't Divide by 0";
    }
    @Override
    public String getMessage() {
        return "Can't Divide by 0";
    }
}

class Calculator{
    double Subtract(double a, double b){
        
        return a-b;
    }
    double Addition(double ...arr){
        double sum = 0;
        for(double ele: arr){
            sum += ele;
        }
        return sum;
    }
    double Multiply(double ...arr) throws Multiplyinput{
        double mult = 1;
        for(double ele: arr){
            mult += ele;
            if(ele>7000){
                throw new Multiplyinput();
            }
        }
        return mult;
    }
    double Divide(double dividend, double divisor) throws CannotDividebyZero{
        if(divisor == 0){
            throw new CannotDividebyZero();
        }
        return dividend/divisor;
    }
}

public class Exercise6_Calculator {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        Scanner scan = new Scanner(System.in);
        String n = "";
        while(true){
            System.out.print("Enter Input according to operation \n1: Subtract\n2:Addition\n3:Multiplication\n4:Divide\n5:Exit\n n: ");
            n = scan.next();
            if(n.equals("1")){
                try{
                    System.out.print("Number 1: ");
                    double num1 = scan.nextDouble();
                    System.out.print("Number 2: ");
                    double num2 = scan.nextDouble();
                        if(num1 > 100000 || num2 > 100000){
                            throw new MaxInput(); 
                        }else if(num1 == 8 || num1 == 9 || num2 == 8 || num2 ==9){
                            throw new invalidInput();
                        }
                    System.out.printf("Subtraction of %.2f and %.2f: %.2f\n",num1,num2,c1.Subtract(num1, num2));
                    }catch(invalidInput | MaxInput e){
                        System.out.println(e);
                    }
            }else if(n.equals("2")){
                try{
                System.out.print("Number 1: ");
                double num1 = scan.nextDouble();
                System.out.print("Number 2: ");
                double num2 = scan.nextDouble();
                    if(num1 > 100000 || num2 > 100000){
                        throw new MaxInput(); 
                    }else if(num1 == 8 || num1 == 9 || num2 == 8 || num2 ==9){
                        throw new invalidInput();
                    }
                System.out.printf("Additon of %.2f and %.2f: %.2f\n",num1,num2,c1.Addition(num1, num2));
                }catch(invalidInput | MaxInput e){
                    System.out.println(e);
                }

            }else if(n.equals("3")){
                try{
                    System.out.print("Number 1: ");
                    double num1 = scan.nextDouble();
                    System.out.print("Number 2: ");
                    double num2 = scan.nextDouble();
                        if(num1 > 100000 || num2 > 100000){
                            throw new MaxInput(); 
                        }else if(num1 == 8 || num1 == 9 || num2 == 8 || num2 ==9){
                            throw new invalidInput();
                        }
                    System.out.printf("Multiplication of %.2f and %.2f: %.2f\n",num1,num2,c1.Multiply(num1, num2));
                    }catch(invalidInput | MaxInput | Multiplyinput e){
                        System.out.println(e);
                    }

            }else if(n.equals("4")){
                try{
                    System.out.print("Number 1: ");
                    double num1 = scan.nextDouble();
                    System.out.print("Number 2: ");
                    double num2 = scan.nextDouble();
                        if(num1 > 100000 || num2 > 100000){
                            throw new MaxInput(); 
                        }else if(num1 == 8 || num1 == 9 || num2 == 8 || num2 ==9){
                            throw new invalidInput();
                        }
                    System.out.printf("Division of %.2f and %.2f: %.2f\n",num1,num2,c1.Divide(num1, num2));
                    }catch(invalidInput | MaxInput | CannotDividebyZero e){
                        System.out.println(e);
                    }
            }else if(n.equals("5") || n.equalsIgnoreCase("exit")){
                break;
            }else{
                System.out.println("Provide correct input for perticular operation");
            }
        }
    }
}
