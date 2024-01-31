public class Practice7_10 {
    public static void main(String[] args) {
        int celcius = 0;
        float Fahrenheit;
        while(celcius < 29){
            Fahrenheit = (celcius * 9/5f) + 32;
            celcius ++;
            System.out.printf("%d Celcius = %.2f\n",celcius,Fahrenheit);
        }
    }
}
