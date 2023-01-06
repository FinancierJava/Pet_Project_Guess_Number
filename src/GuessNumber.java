import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = null;
        int numberAttempts;
        int limit;
        String greeting;
        String wrongInput = "You seem to have entered the wrong response. Try again, please. Remember that" +
                "your input must begin with a lowercase letter." +
                "For convenience, you can simply copy and paste the suggested variant.";

        System.out.println("Hello, dear user! Welcome to the 'Guess the Number' game. If you do not know the rules, " +
                "you can read them by typing 'yes'. If you wish to continue, write 'no' ");
        var rules = new Scanner(System.in).nextLine();
        var textRules = "You will have to guess the number in several tries. You will also be provided with hints";
        if (rules.equals("yes")) {
            System.out.println(textRules);
            System.out.println("What game difficulty do you prefer? [difficult; easy] Enter.");
            var difficulty = new Scanner(System.in).nextLine();
            if (difficulty.equals("difficult")) {
                numberAttempts = 5;
                limit = 144;
                greeting = "You will have " + numberAttempts + " tries to guess a number between [0," + limit + "). " +
                        "Write your first number.";
                System.out.println(greeting);

                int numberPerson = 0;
                int mysteryNumber = (int) (Math.random() * limit);
                for (var i = 1; i <= numberAttempts; i++) {
                    numberPerson = sc.nextInt();

                    if (numberPerson == mysteryNumber) {
                        text = "Congratulations, you have guessed the number!";
                        System.out.println(text);
                        break;
                    } else if (numberPerson < mysteryNumber) {
                        text = numberPerson + " is smaller than the puzzle number.";
                        System.out.println(text);
                    } else {
                        text = numberPerson + " is greater than the puzzle number.";
                        System.out.println(text);
                    }

                }
                System.out.println();
                String str = Integer.toString(numberPerson);
                if (text.equals(str + " is greater than the puzzle number.")
                        || text.equals(numberPerson + " is smaller than the puzzle number."))
                    System.out.println("Unfortunately, you have lost! The puzzle number has been " + mysteryNumber
                            + ".");


            } else if (difficulty.equals("easy")) {
                numberAttempts = 5;
                limit = 64;
                greeting = "You will have " + numberAttempts + " tries to guess a number between [0," + limit + "). " +
                        "Write your first number.";
                System.out.println(greeting);

                int numberPerson = 0;
                int mysteryNumber = (int) (Math.random() * limit);
                for (var i = 1; i <= numberAttempts; i++) {
                    numberPerson = sc.nextInt();

                    if (numberPerson == mysteryNumber) {
                        text = "Congratulations, you have guessed the number!";
                        System.out.println(text);
                        break;
                    } else if (numberPerson < mysteryNumber) {
                        text = numberPerson + " is smaller than the puzzle number.";
                        System.out.println(text);
                    } else  {
                        text = numberPerson + " is greater than the puzzle number.";
                        System.out.println(text);
                    }

                }
                System.out.println();
                String str = Integer.toString(numberPerson);
                if (text.equals(str + " is greater than the puzzle number.")
                        || text.equals(numberPerson + " is smaller than the puzzle number."))
                    System.out.println("Unfortunately, you have lost! The puzzle number has been " + mysteryNumber
                            + ".");

            } else {
                System.out.println(wrongInput);
            }
        } else if (rules.equals("no")) {

                System.out.println("What game difficulty do you prefer? [difficult; easy] Enter.");
                String difficulty = new Scanner(System.in).nextLine();
                if (difficulty.equals("difficult")) {
                    numberAttempts = 5;
                    limit = 144;
                    greeting = "You will have " + numberAttempts + " tries to guess a number between [0," + limit + "). " +
                            "Write your first number.";
                    System.out.println(greeting);

                    int numberPerson = 0;
                    int mysteryNumber = (int) (Math.random() * limit);
                    for (var i = 1; i <= numberAttempts; i++) {
                        numberPerson = sc.nextInt();

                        if (numberPerson == mysteryNumber) {
                            text = "Congratulations, you have guessed the number!";
                            System.out.println(text);
                            break;
                        } else if (numberPerson < mysteryNumber) {
                            text = numberPerson + " is smaller than the puzzle number.";
                            System.out.println(text);
                        } else {
                            text = numberPerson + " is greater than the puzzle number.";
                            System.out.println(text);
                        }

                    }
                    System.out.println();
                    String str = Integer.toString(numberPerson);
                    if (text.equals(str + " is greater than the puzzle number.")
                            || text.equals(numberPerson + " is smaller than the puzzle number."))
                        System.out.println("Unfortunately, you have lost! The puzzle number has been " + mysteryNumber
                                + ".");


                } else if (difficulty.equals("easy")) {
                    numberAttempts = 5;
                    limit = 64;
                    greeting = "You will have " + numberAttempts + " tries to guess a number between [0," + limit + "). " +
                            "Write your first number.";
                    System.out.println(greeting);

                    int numberPerson = 0;
                    int mysteryNumber = (int) (Math.random() * limit);
                    for (var i = 1; i <= numberAttempts; i++) {
                        numberPerson = sc.nextInt();

                        if (numberPerson == mysteryNumber) {
                            text = "Congratulations, you have guessed the number!";
                            System.out.println(text);
                            break;
                        } else if (numberPerson < mysteryNumber) {
                            text = numberPerson + " is smaller than the puzzle number.";
                            System.out.println(text);
                        } else {
                            text = numberPerson + " is greater than the puzzle number.";
                            System.out.println(text);
                        }

                    }
                    System.out.println();
                    String str = Integer.toString(numberPerson);
                    if (text.equals(str + " is greater than the puzzle number.")
                            || text.equals(numberPerson + " is smaller than the puzzle number."))
                        System.out.println("Unfortunately, you have lost! The puzzle number has been " + mysteryNumber
                                + ".");

                } else {
                    System.out.println(wrongInput);
                }


            } else
                System.out.println(wrongInput);


        }
    }


