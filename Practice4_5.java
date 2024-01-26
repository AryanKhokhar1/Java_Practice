// Check Leap Year

import java.util.Scanner;

public class Practice4_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Check the year is leap year or not");
        System.out.print("Year: ");
        int year = sc.nextInt();
        if(year%4 == 0){
            if(year%100 == 0){
                System.out.println(year+" isn't Leap Year");
            }else{
                System.out.println(year+ " is a leap year");
            }
        }

    }
}
