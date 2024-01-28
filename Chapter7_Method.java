public class Chapter7_Method {

    // Here a,b contain copies value of x,y 
    static int sumation(int a, int b){
        int sum;
        sum = a+b;

        a = 100; // If we change a,b in the method it doesn't affect x,y in the main method
        return sum;
    }
    public static void main(String[] args) {
        Chapter7_Method ch7m = new Chapter7_Method();
        int x = 5;
        int y = 6;
        System.out.println(ch7m.sumation(x, y));
        System.out.println(x+" "+y);
    }
}
