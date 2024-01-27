public class Practice6_1 {
    public static void main(String[] args) {
        float[] num = {45.6f , 23.1f, 98.0f, 79.3f, 9.1f};
        float sum = 0f;
        for(int i = 0; i<num.length; i++){
            sum += num[i];
        }
        System.out.println("Total ="+sum);
    }
}
