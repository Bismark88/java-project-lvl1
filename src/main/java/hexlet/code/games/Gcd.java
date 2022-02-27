package hexlet.code.games;

import java.util.Scanner;
import java.util.Random;
import hexlet.code.Engine;

public class Gcd extends Engine {
    private static final String QUESTION = "Find the greatest common divisor of given numbers.";
    private static String correctAnswer = "";

    public static void gameGcd() {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        constructHello();
        askQuestion(QUESTION);

        while (getCounter() < COUNT_VICTORY) {
            int number1 = random.nextInt(RANGE);
            int number2 = random.nextInt(RANGE);
            System.out.println("Question: " + number1 + " " + number2);
            correctAnswer = getCorrectAnswer(number1, number2);
            String answerUser = Integer.toString(input.nextInt());
            System.out.println("Your answer: " + answerUser);

            checkVictory(answerUser, correctAnswer);
        }
        askEnd();
    }

    private static String getCorrectAnswer(int number1, int number2) {
        int result = 0;
        while (number1 != 0 && number2 != 0) {
            if (number1 > number2) {
                number1 = number1 % number2;
            } else {
                number2 = number2 % number1;
            }
        }
        return Integer.toString(number1 + number2);
    }
}
