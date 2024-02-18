package Practice12_1;

public class Calculator {

    public double Sum(double a, double b, double ...num){
        double sumofnum = 0;
        for(double ele: num){
            sumofnum += ele;
        }
        return (sumofnum + a + b);
    }
    public double Subract(double a, double b){
        return a-b;
    }
    public double Multiply(double a, double b, double ...num){
        double sumofnum = 1;
        for(double ele: num){
            sumofnum *= ele;
        }
        return (sumofnum * a * b);
    }
    public double Divide(double a, double b){
        return a/b;
    }
    public static void main(String[] args) {
        Calculator cal1 = new Calculator();
        System.out.println(cal1.Sum(2, 3,5,6,6));
        System.out.println(cal1.Multiply(2,2,2,2,2));
        System.out.println(cal1.Subract(4.5, 8));
        System.out.println(cal1.Divide(5,6));
    }
}
