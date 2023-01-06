import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        //the text about win or the entered number is less or more than the guessed number:
        String victoryLoss;

        //the text that will be displayed if the user enters the invalid response:
        String wrongInput = "You seem to have entered the wrong response. Try again, please." +
                "Remember that your input must begin with a lowercase letter." +
                "For convenience, you can simply copy and paste the suggested variant.";

        //the number of tries a player will have:
        int numberAttempts = 0;

        int limitTo = 0;

        //greeting after selecting the game difficulty:
        String greeting;


        //The first greeting and the choice to read the rules or not:
        System.out.println("Hello, dear user! Welcome to the 'Guess the Number' game. If you do not know the rules, " +
                "you can read them by typing 'yes'. If you wish to continue, write 'no' ");
        String personRules;
        do {
            personRules = new Scanner(System.in).nextLine();
            if (personRules.equals("yes")) {
                System.out.println("You will have to guess the number in several tries. " +
                        "You will also be provided with hints" + "\n");
            } else if (!personRules.equals("no")) {
                System.out.println(wrongInput);
            }
        } while (!personRules.equals("no") && !personRules.equals("yes"));


        //game difficulty selection
        System.out.println("What game difficulty do you prefer? [difficult; easy] Enter.");
        String personDifficulty;

        do {
            personDifficulty = new Scanner(System.in).nextLine();
            if (personDifficulty.equals("difficult")) {
                numberAttempts = 5;
                limitTo = 64;
            } else if (personDifficulty.equals("easy")) {
                numberAttempts = 5;
                limitTo = 32;
            } else
                System.out.println(wrongInput);
        } while (!personDifficulty.equals("difficult") && !personDifficulty.equals("easy"));
        System.out.println();


        //Starting the game after selecting a difficulty:
        greeting = "You will have " + numberAttempts + " tries to guess the number between [0 , " + limitTo + "). "
                + "Write your first number";

        //Display a welcome message with the terms of the game:
        System.out.println(greeting);

        //a variable that contains the number that the player has chosen:
        int numberPerson = 0;

        //creating a random number:
        int guessedNumber = (int) ((Math.random()) * limitTo);


        //The game itself
        for (int i = 1; i < numberAttempts; i++) {
            numberPerson = new Scanner(System.in).nextInt();
            if (numberPerson < guessedNumber) {
                victoryLoss = numberPerson + " is smaller than the puzzle number.";
                System.out.println(victoryLoss);

            } else if (numberPerson > guessedNumber) {
                victoryLoss = numberPerson + " is greater than the puzzle number.";
                System.out.println(victoryLoss);
            } else
                break;
        }


        //End of game:
        if (numberPerson == guessedNumber)
            System.out.println("Congratulations, you have guessed the number!");
        else {
            numberPerson = new Scanner(System.in).nextInt();
            if (numberPerson != guessedNumber)
                System.out.println("Unfortunately, you have lost! The puzzle number has been " + guessedNumber + " .");
            else
                System.out.println("Congratulations, you have guessed the number!");

        }

    }

}