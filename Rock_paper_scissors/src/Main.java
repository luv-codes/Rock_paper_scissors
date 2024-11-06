import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        //Object for Scanner class
        Scanner Rockpapershoot = new Scanner(System.in);

        // Question for player
        System.out.println("Enter = 0 for rock, 1 for paper, 2 for scissors :");

        // Player will Enter a move
        int entermove = Rockpapershoot.nextInt();

        // Random number will be Generated max limit is 2
        Random random = new Random();
        int compmove = random.nextInt(3);



        // Bounding Player move under 2
        if (entermove > 2 || entermove<0) {
            System.out.println("Enter a correct number please 🙏");

            // If in Range then what to do next.
        }else {

            // Random number generated is 0 then show Rock
            if (compmove == 0 ) {
                System.out.println("Computer Move = Rock");

                // Random number generated is 1 then show Paper
            } else if (compmove == 1) {
                System.out.println("Computer Move = Paper");

                // Random number generated is 2 then show Scissors
            } else if (compmove == 2) {
                System.out.println("Computer Move = Scissors");
            }

            // Move of Player is 0 then show Rock
            if (entermove == 0 ) {
                System.out.println("Your Move = Rock");
                // Move of Player is 1 then show Paper
            } else if (entermove == 1) {
                System.out.println("Your Move = Paper");
                // Move of Player is 2 then show Scissors
            } else if (entermove == 2) {
                System.out.println("Your Move = Scissors");
            }

            // DRAW, WIN, LOSE Conditions:
            if (compmove == entermove) {
                System.out.println("Draw");
            } else if (compmove == 0 && entermove == 1) {
                System.out.println("You Win");
            } else if (compmove == 0 && entermove == 2) {
                System.out.println("Computer Win");
            } else if (compmove == 1 && entermove == 0) {
                System.out.println("Computer Wins");
            }  else if (compmove == 1 && entermove == 2) {
                System.out.println("You Wins");
            } else if (compmove == 2 && entermove == 0) {
                System.out.println("You Wins");
            } else if (compmove == 2 && entermove == 1) {
                System.out.println("Computer Wins");


            }

        }
    }
}