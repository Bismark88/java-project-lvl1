package hexlet.code.games;

import java.util.Scanner;
import java.util.Random;
import hexlet.code.Engine;

public class Calc extends Engine {
    private static final int RANGE_OPERATOR = 2;
    private static final String QUESTION = "What is the result of the expression?";
    private static String correctAnswer = "";
    private static final char[] OPERATION_LABEL = new char[]{'+', '-', '*'};

    public static void calc() {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        constructHello();
        askQuestion(QUESTION);

        while (getCounter() < COUNT_VICTORY) {
            int number1 = random.nextInt(RANGE);
            int number2 = random.nextInt(RANGE);
            correctAnswer = getCorrectAnswer(number1, number2);
            String answerUser = Integer.toString(input.nextInt());
            System.out.println("Your answer: " + answerUser);

            checkVictory(answerUser, correctAnswer);
        }
        askEnd();
    }

    private static String getCorrectAnswer(int number1, int number2) {
        Random random = new Random();
        int operation = random.nextInt(RANGE_OPERATOR);
        switch (operation) {
            case 0:
                correctAnswer = Integer.toString(number1 + number2);
                System.out.println("Question: " + number1 + OPERATION_LABEL[operation] + number2);
                break;
            case 1:
                correctAnswer = Integer.toString(number1 - number2);
                System.out.println("Question: " + number1 + OPERATION_LABEL[operation] + number2);
                break;
            case 2:
                correctAnswer = Integer.toString(number1 * number2);
                System.out.println("Question: " + number1 + OPERATION_LABEL[operation] + number2);
                break;
            default: break;

        }
        return correctAnswer;
    }
}
