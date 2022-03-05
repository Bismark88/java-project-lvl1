package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    private static final int RANGE_OPERATION = 3;
    private static final String GAME_RULES  = "What is the result of the expression?";
    private static final String[] MATH_OPERATION = new String[]{"+", "-", "*"};

    public static void gameCalc() {
        String[] gameQuestion = new String[Engine.ROUND_COUNTER];
        String[] correctAnswer = new String[Engine.ROUND_COUNTER];
        for (int i = 0; i < Engine.ROUND_COUNTER; i++) {
            int number1 = Engine.getRandomNumber(Engine.MAX_RANDOM);
            int number2 = Engine.getRandomNumber(Engine.MAX_RANDOM);
            int numberMathOperation = Engine.getRandomNumber(RANGE_OPERATION);
            gameQuestion[i] = String.format("%s %s %s", number1, MATH_OPERATION[numberMathOperation], number2);
            correctAnswer[i] = getCorrectAnswer(number1, number2, numberMathOperation);
        }
        Engine.runGame(GAME_RULES, gameQuestion, correctAnswer);
    }

    private static String getCorrectAnswer(int number1, int number2, int numberMathOperation) {
        String correctAnswer = "";
        switch (numberMathOperation) {
            case 0:
                correctAnswer = Integer.toString(number1 + number2);
                break;
            case 1:
                correctAnswer = Integer.toString(number1 - number2);
                break;
            case 2:
                correctAnswer = Integer.toString(number1 * number2);
                break;
            default: break;

        }
        return correctAnswer;
    }
}
