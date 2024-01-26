// Switch Case

import java.util.Scanner;

public class Chapter4_Switch_Case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Age: ");
        int age = sc.nextInt();

        // switch used for to perform action for a perticular condition
        switch (age) {
            case 18:
                System.out.println("You're adult now");
                break;

            case 21:
                System.out.println("You're going to join a job");
                break;
            
            case 60:
                System.out.println("You're going to retired");
                break;

            default:
                System.out.println("Enjoy your life");
                break;
        }

        // Enhanced Switch
        switch(age){
            case 18 -> System.out.println("You're an adult now");
            case 21 -> System.out.println("You're going to get a job");
            case 60 -> System.out.println("You're going to retired");
            default -> System.out.println("Enjoy your life");
        }
    }
}
