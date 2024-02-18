package Practice12_1;

public class ScCalculator {

    public int pow(int a, int b){
        int mult = 1;
        int n = 0;
        while(n<b){
            mult *= a;
        }
        return mult;
    }
    public static void main(String[] args) {
        ScCalculator sccal = new ScCalculator();
        System.out.println(sccal.pow(2, 3));
        System.out.println("hello");
    }
}
