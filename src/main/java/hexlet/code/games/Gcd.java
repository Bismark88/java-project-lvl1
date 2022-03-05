package hexlet.code.games;

import hexlet.code.Engine;

public class Gcd {
    private static final String GAME_RULES = "Find the greatest common divisor of given numbers.";

    public static void gameGcd() {
        String[] gameQuestion = new String[Engine.ROUND_COUNTER];
        String[] correctAnswer = new String[Engine.ROUND_COUNTER];
        for (int i = 0; i < Engine.ROUND_COUNTER; i++) {
            int number1 = Engine.getRandomNumber(Engine.MAX_RANDOM);
            int number2 = Engine.getRandomNumber(Engine.MAX_RANDOM);
            gameQuestion[i] = String.format("%s %s", number1, number2);
            correctAnswer[i] = getCorrectAnswer(number1, number2);
        }
        Engine.runGame(GAME_RULES, gameQuestion, correctAnswer);
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
