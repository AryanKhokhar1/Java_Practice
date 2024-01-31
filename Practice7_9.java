public class Practice7_9 {
    static float Converter(float celcius){
        return (celcius * 9/5f) + 32;
    }
    public static void main(String[] args) {
        float cel = 25.87f;
        System.out.printf("%.2f* Celcius = %.2f Fahrenheit",cel,Converter(cel));
    }
}
