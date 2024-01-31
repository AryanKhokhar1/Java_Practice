public class Practice7_6 {
    static float Average(float ...fs){
        float sum = 0.0f;
        for(float element:fs){
            sum += element;
        }
        return sum/fs.length;
    }
    public static void main(String[] args) {
        System.out.printf("Average of number =  %.2f",Average(10.1f,20.8f,30.7f));
    }
}
