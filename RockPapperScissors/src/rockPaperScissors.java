import java.util.Random;
import java.util.Scanner;

public class rockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
        String[] rps = {"rock","paper","scissors"};
        String computerMove = rps[new Random().nextInt(rps.length)];
        String playerMove;

        while(true){

        System.out.println("Please enter your move(rock, paper, or scissor)");
        playerMove = scanner.nextLine();
        if(playerMove.equals("rock") || playerMove.equals("paper") || playerMove.equals("scissor")) {
            break;
        }
        System.out.println(playerMove + "Is not a valid move");
    }
        System.out.println("Computer Played " + computerMove);

        if(playerMove.equals(computerMove)){
            System.out.println("Game was a tie");
        }
        else if (playerMove.equals("rock")) {
            if(computerMove.equals("paper")){
                System.out.println("You Lost");
            } else if (computerMove.equals("scissors")) {
                System.out.println("You Win");
            }
        }
        else if (playerMove.equals("paper")) {
            if(computerMove.equals("scissors")){
                System.out.println("You Lost");
            } else if (computerMove.equals("rock")) {
                System.out.println("You Win");
            }
        }else if (playerMove.equals("scissors")) {
            if(computerMove.equals("rock")){
                System.out.println("You Lost");
            } else if (computerMove.equals("paper")) {
                System.out.println("You Win");
            }
        }
            System.out.println("Play Again? (y/n)");
            String playAgain = scanner.nextLine();
            if(!playAgain.equals("y")){
                break;
            }
            scanner.close();
        }

    }
    }
