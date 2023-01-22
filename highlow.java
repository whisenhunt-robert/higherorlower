import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class highlow {
    public static void main(String[] args) {
        // This creates a two list array to form a thank you at the end of the game.
        ArrayList<String> thanks = new ArrayList<String>();
        thanks.add("Be sure to try your luck again sometime");
        thanks.add("and thank you for playing.");
        // This sets the playerChoice variable to be blank by default.
        String playerChoice = "";
        // This allows for the random number generater to work.
        Random rand = new Random();
        // This opens up the scanner for the program to allow user input.
        Scanner scan = new Scanner(System.in);
        // This prints out the welcome message.
        System.out.println("Welcome to Higher or Lower. Let's see how many times you can win in a row!");
        System.out.println("Please declare if you think your number will be higher or lower than mine.");
        // This keeps track of how many times you win a game.
        int wins = 0;
        // This keeps track of how many times you and the cpu tied.
        int ties = 0;
        // This while loop is what makes the whole game work.
        while (true) {
            // This prompts the user to input the letter 'h' or 'l' to specify if they think
            // their number will be higher or lower than the cpu.
            // If they try to enter anything else, it repeats this question.
            // Note: It is case sensitive, so the user input must be lowercase.
            System.out.println("Please type 'h' for Higher or 'l' for Lower: ");
            playerChoice = scan.nextLine();
            // If the player guesses higher, this if statement will run.
            if (playerChoice.equals("h")) {
                // This randomly picks a number between 1-15 for the player.
                int playerNumber = rand.nextInt(14) + 1;
                // This randomly picks a number between 1-15 for the cpu.
                int cpuNumber = rand.nextInt(14) + 1;
                // This tells the system to print your number and the cpu's number.
                System.out.println("Your number is " + playerNumber);
                System.out.println("My number is " + cpuNumber);
                if (playerNumber > cpuNumber) {
                    System.out.println("You win! Congratulations!");
                    // This adds 1 point to your score of how many wins you have.
                    wins++;
                } else if (playerNumber < cpuNumber) {
                    // If user guessed higher but the cpu's number was higher, this statement runs.
                    System.out.println("I'm sorry, it looks like I win this one. Better luck next time!\n");
                    // This prints out the total wins and ties the player had before losing.
                    System.out.println("Total wins: " + wins);
                    System.out.println("Total ties: " + ties + "\n"); // the \n here works as a line break.
                    // This closes the snanner.
                    scan.close();
                    // This prints out the array.
                    System.out.println(thanks);
                    // The break statement puts an end the loop.
                    break;
                } else if (playerNumber == cpuNumber) {
                    // If the user and cpu's numbers result in a tie, this statement will run.
                    System.out.println("Well nobody can win with a tie, thanks for wasting both of our time!");
                    // This adds 1 point to how many times you and the cpu tied.
                    ties++;
                }
            }
            // If the player guesses lower, this if statement will run.
            if (playerChoice.equals("l")) {
                // This randomly picks a number between 1-15 for the player.
                int playerNumber = rand.nextInt(14) + 1;
                // This randomly picks a number between 1-15 for the cpu.
                int cpuNumber = rand.nextInt(14) + 1;
                // This tells the system to print your number and the cpu's number.
                System.out.println("Your number is " + playerNumber);
                System.out.println("My number is " + cpuNumber);
                if (playerNumber < cpuNumber) {
                    System.out.println("You win! Congratulations!");
                    // This adds 1 point to your score of how many wins you have.
                    wins++;
                } else if (playerNumber > cpuNumber) {
                    // If user guessed lower but the cpu's number was lower, this statement runs.
                    System.out.println("I'm sorry, it looks like I win this one. Better luck next time!\n");
                    // This prints out the total wins and ties the player had before losing.
                    System.out.println("Total wins: " + wins);
                    System.out.println("Total ties: " + ties + "\n"); // the \n here works as a line break.
                    // This closes the scanner.
                    scan.close();
                    // This prints out the array.
                    System.out.println(thanks);
                    // This return statement is used as an additional break statement to end the
                    // loop.
                    return;
                    // If the game results in a tie, this else if statement triggers.
                } else if (playerNumber == cpuNumber) {
                    // If the user and cpu's numbers result in a tie, this statement will run.
                    System.out.println("Well nobody can win with a tie, thanks for wasting both of our time!");
                    // This adds 1 point to how many times you and the cpu tied.
                    ties++;
                    // Following a tie, it adds a point and restarts the loop, prompting the user to
                    // enter an 'h' or 'l' again.
                }
            }
        }
    }
}