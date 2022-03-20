package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Gcd {
    private static final int MAX_RANDOM = 100;
    private static final String GAME_RULES = "Find the greatest common divisor of given numbers.";

    public static void gameGcd() {
        String[][] gameQuestionAndAnswer = new String[Engine.ROUND_COUNTER][Engine.SUBARRAY_LENGTH];
        for (int i = 0; i < Engine.ROUND_COUNTER; i++) {
            int number1 = Utils.getRandomNumber(MAX_RANDOM);
            int number2 = Utils.getRandomNumber(MAX_RANDOM);
            gameQuestionAndAnswer[i][Engine.INDEX_QUESTION] = String.format("%s %s", number1, number2);
            gameQuestionAndAnswer[i][Engine.INDEX_ANSWER] = getCorrectAnswer(number1, number2);
        }
        Engine.runGame(GAME_RULES, gameQuestionAndAnswer);
    }

    private static String getCorrectAnswer(int number1, int number2) {
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
