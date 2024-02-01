// Creating a Number guessing game
import java.util.Random;
import java.util.Scanner;
class NumGuess_Game{
    int random_number;
    int guess_number;
    String result;
    int n = 6;
    int score = -1;
    NumGuess_Game(){
        Random rand = new Random();
        this.random_number = rand.nextInt(101);
        System.out.println("Welcome in Number Guess Game:");
        System.out.println("(Max Score: 1000)");
        Scanner scan = new Scanner(System.in);
        while(n>0){
            System.out.print("Guess Number: ");
            guess_number = scan.nextInt();
            result = this.Check(guess_number);
            System.out.println(result);
            System.out.println(--n+" Chances Left");
            if(result.equalsIgnoreCase("you won")){
                System.out.println("\nScore: "+this.Score(n));
                break;
            }
        }
        if(score == -1){
            System.out.println("\n\nYou Lose!");
        }
    }
    private String Check(int guess_number){
        if(guess_number == this.random_number){
            return "You won";
        }else if(guess_number > this.random_number){
            return "Guess Lower";
        }else{
            return "Guess Higher";
        }
    }
    private int Score(int turn){
        return  (turn*180 + 100);
    }
}

public class Exercise3_Guess_the_Number {
    public static void main(String[] args) {
        NumGuess_Game game1 = new NumGuess_Game();
        
    }
}
