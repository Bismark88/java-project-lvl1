package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    private static final String GAME_RULES = "Answer 'yes' if number even otherwise answer 'no'.";

    public static void gamePrime() {
        String[] gameQuestion = new String[Engine.ROUND_COUNTER];
        String[] correctAnswer = new String[Engine.ROUND_COUNTER];
        for (int i = 0; i < Engine.ROUND_COUNTER; i++) {
            int number = Engine.getRandomNumber(Engine.MAX_RANDOM);
            gameQuestion[i] = String.valueOf(number);
            correctAnswer[i] = getCorrectAnswer(number);
        }
        Engine.runGame(GAME_RULES, gameQuestion, correctAnswer);
    }

    private static String getCorrectAnswer(int number) {
        String correctAnswer = "yes";
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                correctAnswer = "no";
            }
        }
        return correctAnswer;
    }
}
