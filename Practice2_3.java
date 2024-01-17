import java.util.Random;
import java.util.Scanner;

public class Practice2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        int input_number = sc.nextInt();

        Random random = new Random();

        int random_number = random.nextInt(100);

        if(random_number > input_number){
            System.out.println("Random Number "+random_number+" is greater than Input Number"+input_number);
        }else if(input_number > random_number){
            System.out.println("Random Number "+random_number+" is smaller than Input Number"+input_number);
        }else{
            System.out.println("Both Number are same "+random_number);
        }
    }
}
