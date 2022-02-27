package hexlet.code.games;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import hexlet.code.Engine;

public class Progression extends Engine {
    private static final String QUESTION = "Please enter the game number and press Enter.";
    private static String correctAnswer = "";
    private static final int PROGRESSION_SIZE = 10;
    private static String[] range = new String[PROGRESSION_SIZE];
    private static int numberHiddenElement;

    public static void gameProgression() {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        constructHello();
        askQuestion(QUESTION);

        while (getCounter() < COUNT_VICTORY) {
            int number1 = random.nextInt(RANGE);
            int number2 = random.nextInt(RANGE);
            range = getArithmeticalProgression(number1, number2);
            correctAnswer = getCorrectAnswer(range);
            range = getRangeWithHiddenElement(range, numberHiddenElement);
            System.out.println("Question: " + String.join(" ", range));
            String answerUser = Integer.toString(input.nextInt());
            System.out.println("Your answer: " + answerUser);

            checkVictory(answerUser, correctAnswer);
        }
        askEnd();
    }

    private static String getCorrectAnswer(String[] pRange) {
        Random random = new Random();
        numberHiddenElement = random.nextInt(range.length - 1);
        correctAnswer = pRange[numberHiddenElement];
        return correctAnswer;
    }

    private static String[] getArithmeticalProgression(int number1, int number2) {
        int[] rangeInt = new int[range.length];
        rangeInt[0] = number1;
        for (int i = 1; i < rangeInt.length; i++) {
            rangeInt[i] = rangeInt[i - 1] + number2;
        }
        range = Arrays.stream(rangeInt).mapToObj(String::valueOf).toArray(String[]::new);
        return range;
    }

    private static String[] getRangeWithHiddenElement(String[] pRange, int pNumberHiddenElement) {
        pRange[pNumberHiddenElement] = "..";
        return pRange;
    }

}
