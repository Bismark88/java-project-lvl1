package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUND_COUNTER = 3;
    public static final int INDEX_QUESTION = 0;
    public static final int INDEX_ANSWER = 1;
    public static final int SUBARRAY_LENGTH = 2;
    public static final String MESSAGE_OF_INCORRECT_ANSWER = "'%s' is wrong answer ;(. Correct answer was '%s'.";
    private static Scanner scanner = new Scanner(System.in);

    public static void runGame(String gameRules, String[][] gameQuestionAndAnswer) {
        int countCorrectAnswer = 0;
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println(gameRules);
        while (countCorrectAnswer < ROUND_COUNTER) {
            System.out.println("Question: " + gameQuestionAndAnswer[countCorrectAnswer][INDEX_QUESTION]);
            System.out.print("Your answer: ");
            String answerUser = scanner.nextLine();
            if (answerUser.equals(gameQuestionAndAnswer[countCorrectAnswer][INDEX_ANSWER])) {
                System.out.println("Correct!");
                countCorrectAnswer++;
            } else {
                System.out.println(String.format(MESSAGE_OF_INCORRECT_ANSWER,
                        answerUser,
                        gameQuestionAndAnswer[countCorrectAnswer][INDEX_ANSWER]));
                System.out.println("Let's try again, " + userName + "!");
                System.exit(0);
            }
        }
        System.out.println("Congratulations, " +  userName + "!");
    }
}
