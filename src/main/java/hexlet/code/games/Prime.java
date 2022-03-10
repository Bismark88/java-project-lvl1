package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    private static final String GAME_RULES = "Answer 'yes' if number even otherwise answer 'no'.";

    public static void gamePrime() {
        String[][] gameQuestionAndAnswer = new String[Engine.ROUND_COUNTER][Engine.SUBARRAY_LENGTH];
        for (int i = 0; i < Engine.ROUND_COUNTER; i++) {
            int number = Engine.getRandomNumber(Engine.MAX_RANDOM);
            gameQuestionAndAnswer[i][Engine.INDEX_QUESTION] = String.valueOf(number);
            gameQuestionAndAnswer[i][Engine.INDEX_ANSWER] = isPrimeNumber(number) ? "yes" : "no";
        }
        Engine.runGame(GAME_RULES, gameQuestionAndAnswer);
    }

    private static boolean isPrimeNumber(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
