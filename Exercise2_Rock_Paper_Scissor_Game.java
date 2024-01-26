// Rock Paper Scissors

import java.util.Scanner;
import java.util.Random;
public class Exercise2_Rock_Paper_Scissor_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int computer_output = rand.nextInt(3);
        String comp_output = new String();
        switch(computer_output){
            case 0 -> comp_output = "Rock";
            case 1 -> comp_output = "Paper";
            case 2 -> comp_output = "Scissor";
        }
        System.out.println("1:Rock, 2:Paper, 3:Scissor Game:-");
        System.out.print("Move: ");
        String user_input = sc.next();

        // Remember == operator used for comparition memory location and equals operator used for compare string

        if(user_input.equals("1") || user_input.equalsIgnoreCase("Rock")){
            if(computer_output == 0){
                System.out.println("Your Move: "+user_input+"\nComputer Move: "+comp_output+"\nResult: Tie");
            }else if(computer_output == 1){
                System.out.println("Your Move: "+user_input+"\nComputer Move: "+comp_output+"\nResult: Yeah! You Win");
            }else if(computer_output == 2){
                System.out.println("Your Move: "+user_input+"\nComputer Move: "+comp_output+"\nResult: Defeated");
            }
        }else if(user_input.equals("2") || user_input.equalsIgnoreCase("Paper")){
            if(computer_output == 0){
                System.out.println("Your Move: "+user_input+"\nComputer Move: "+comp_output+"\nResult: Yeah! You Win");
            }else if(computer_output == 1){
                System.out.println("Your Move: "+user_input+"\nComputer Move: "+comp_output+"\nResult: Tie");
            }else if(computer_output == 2){
                System.out.println("Your Move: "+user_input+"\nComputer Move: "+comp_output+"\nResult: Defeated");
            }
        }else if(user_input.equals("3") || user_input.equalsIgnoreCase("Scissor")){
            if(computer_output == 0){
                System.out.println("Your Move: "+user_input+"\nComputer Move: "+comp_output+"\nResult: Defeated");
            }else if(computer_output == 1){
                System.out.println("Your Move: "+user_input+"\nComputer Move: "+comp_output+"\nResult: Yeah! You Win");
            }else if(computer_output == 2){
                System.out.println("Your Move: "+user_input+"\nComputer Move: "+comp_output+"\nResult: Tie");
            }
        }
    }
}
