// Find out day of the week
import java.util.Scanner;
public class Practice4_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the day Number: ");
        int day = sc.nextInt();
        if(day%7 == 0){
            System.out.println("Monday");
        }else if(day%7 == 1){
            System.out.println("Tuesday");
        }else if(day%7 == 2){
            System.out.println("Wednesday");
        }else if(day%7 == 3){
            System.out.println("Thursday");
        }else if(day%7 == 4){
            System.out.println("Friday");
        }else if(day%7 == 5){
            System.out.println("Saturday");
        }else if(day%7 == 6){
            System.out.println("Sunday");
        }
    }
}
