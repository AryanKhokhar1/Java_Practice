public class Chapter7_fibonacci_series {
    static int fibonacci_series(int x, int y, int limit){
        if(limit == 0){
            return 1;
        }
        System.out.print(x+y+", ");
        return fibonacci_series(y, x+y, limit - 1);
    }
    public static void main(String[] args) {
        System.out.print("0, 1, ");
        int ans = fibonacci_series(0, 1, 10);
    }
}
