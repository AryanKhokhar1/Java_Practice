import java.util.Scanner;

public class Exercise1_1 {
    public static void main(String[] args) {
        System.out.println("Fill up marks out of 100 in all Subjects");
        Scanner mark = new Scanner(System.in);
        System.out.print("Hindi : ");
        double hindi = mark.nextDouble();
        System.out.print("EVS : ");
        double evs = mark.nextDouble();
        System.out.print("Maths : ");
        double maths = mark.nextDouble();
        System.out.print("Science : ");
        double science = mark.nextDouble();
        System.out.print("English : ");
        double english = mark.nextDouble();

        System.out.println("Percentage: "+(hindi+english+maths+evs+science)/5+"%");

    }
}
