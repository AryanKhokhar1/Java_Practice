// Result finder

import java.util.Scanner;

public class Practice4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Fill the Marks of respective subject for result");
        System.out.print("Maths: ");
        double maths = sc.nextDouble();
        System.out.print("Science: ");
        double science = sc.nextDouble();
        System.out.print("English: ");
        double english = sc.nextDouble();
        double percentage = (maths + science + english)/3;
        if(percentage >= 40){
            if(maths >= 33 && science >= 33 && english >= 33){
                System.out.printf("Congrats, You pass the exam\nYou got %.2f%% marks",percentage);
            }else{
                System.out.println("Sorry, You can't make it");
            }
        }else{
            System.out.println("Sorry, You can't make it");
        }
    }
}
