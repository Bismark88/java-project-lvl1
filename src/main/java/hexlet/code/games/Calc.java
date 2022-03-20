package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static final int MAX_RANDOM = 100;
    private static final String GAME_RULES  = "What is the result of the expression?";
    private static final String[] MATH_OPERATION = new String[]{"+", "-", "*"};

    public static void gameCalc() {
        String[][] gameQuestionAndAnswer = new String[Engine.ROUND_COUNTER][Engine.SUBARRAY_LENGTH];
        for (int i = 0; i < Engine.ROUND_COUNTER; i++) {
            int number1 = Utils.getRandomNumber(MAX_RANDOM);
            int number2 = Utils.getRandomNumber(MAX_RANDOM);
            int numberMathOperation = Utils.getRandomNumber(MATH_OPERATION.length);
            gameQuestionAndAnswer[i][Engine.INDEX_QUESTION] = String.format("%s %s %s",
                    number1, MATH_OPERATION[numberMathOperation], number2);
            gameQuestionAndAnswer[i][Engine.INDEX_ANSWER] = getCorrectAnswer(number1, number2, numberMathOperation);
        }
        Engine.runGame(GAME_RULES, gameQuestionAndAnswer);
    }

    private static String getCorrectAnswer(int number1, int number2, int numberMathOperation) {
        switch (numberMathOperation) {
            case 0:
                return Integer.toString(number1 + number2);
            case 1:
                return Integer.toString(number1 - number2);
            case 2:
                return Integer.toString(number1 * number2);
            default: break;
        }
        return null;
    }
}
