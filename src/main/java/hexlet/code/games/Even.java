package hexlet.code.games;

import java.util.Scanner;
import java.util.Random;
import hexlet.code.Engine;

public class Even extends Engine {
    private static final String QUESTION = "Answer 'yes' if number even otherwise answer 'no'.";

    public static void gameEven() {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        constructHello();
        askQuestion(QUESTION);

        while (getCounter() < COUNT_VICTORY) {
            int number = random.nextInt(RANGE);
            System.out.println("Question: " + number);

            String answerUser = input.next();
            System.out.println("Your answer: " + answerUser);

            checkVictory(answerUser, getCorrectAnswer(number));
        }
        askEnd();
    }

    private static String getCorrectAnswer(int number) {
        String correctAnswer = "no";
        if (number % 2 == 0) {
            correctAnswer = "yes";
        }
        return correctAnswer;
    }

}
