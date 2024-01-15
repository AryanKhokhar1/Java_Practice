import java.text.DecimalFormat;
import java.util.Scanner;

public class Practice1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of Subjects(out of 100) below:");
        System.out.print("Maths :");
        double maths = sc.nextDouble();
        System.out.print("Physics :");
        double physics = sc.nextDouble();
        System.out.print("English :");
        double english = sc.nextDouble();

        double percentage = (maths+physics+english)/30;
        DecimalFormat df = new DecimalFormat("#.0");
        String CGPA = df.format(percentage);
        if(CGPA.indexOf("0") == 2){
            CGPA = CGPA.substring(0, 1);
        }
        System.out.println("CGPA: "+CGPA);
    }
}
