package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Engine {
    public static final int ROUND_COUNTER = 3;
    public static final int MAX_RANDOM = 100;
    public static final String MESSAGE_OF_INCORRECT_ANSWER = "'%s' is wrong answer ;(. Correct answer was '%s'.";
    private static int countCorrectAnswer = 0;
    private static String userName = "";
    private static String answerUser = "";

    public static String getUserName() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name?");
        Scanner getUserName = new Scanner(System.in);
        userName = getUserName.nextLine();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }

    public static void runGame(String gameRules, String[] gameQuestion, String[] correctAnswer) {
        userName = getUserName();
        Scanner getAnswer = new Scanner(System.in);
        System.out.println(gameRules);
        while (countCorrectAnswer < ROUND_COUNTER) {
            System.out.println("Question: " + gameQuestion[countCorrectAnswer]);
            System.out.print("Your answer: ");
            answerUser = getAnswer.nextLine();
            checkVictory(answerUser, correctAnswer[countCorrectAnswer]);
        }
        askEnd();
    }

    public static void checkVictory(String pAnswerUser, String pCorrectAnswer) {
        if (answerUser.equals(pCorrectAnswer)) {
            System.out.println("Correct!");
            countCorrectAnswer++;
        } else {
            System.out.println(String.format(MESSAGE_OF_INCORRECT_ANSWER, pAnswerUser, pCorrectAnswer));
            System.out.println("Let's try again, " + userName + "!");
            System.exit(0);
        }
    }

    public static void askEnd() {
        System.out.println("Congratulations, " +  userName + "!");
    }

    public static int getRandomNumber(int maxRandom) {
        Random random = new Random();
        return random.nextInt(maxRandom);
    }
}
