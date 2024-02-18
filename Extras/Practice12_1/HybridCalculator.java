package Practice12_1;

public class HybridCalculator {
    Calculator cal = new Calculator();
    public double speed(double distance, double time){
        return cal.Divide(distance,time);
    }
    public double time(double speed, double distance){
        return cal.Divide(distance, speed);
    }
    public static void main(String[] args) {
        HybridCalculator hycal = new HybridCalculator();
        System.out.printf("%.2f",hycal.speed(100, 3.50));
    }
}
