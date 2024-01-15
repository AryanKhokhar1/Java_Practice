import java.text.DecimalFormat;
import java.util.Scanner;

public class Practice1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Converter Kilometers to Miles");
        System.out.print("Kilometer: ");
        double kilometer = sc.nextDouble();
        double miles = kilometer*0.62137;
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.print("Miles: "+ df.format(miles));
    }
}
