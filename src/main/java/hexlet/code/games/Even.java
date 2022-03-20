package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final int MAX_RANDOM = 100;
    private static final String GAME_RULES = "Answer 'yes' if number even otherwise answer 'no'.";

    public static void gameEven() {
        String[][] gameQuestionAndAnswer = new String[Engine.ROUND_COUNTER][Engine.SUBARRAY_LENGTH];
        for (int i = 0; i < Engine.ROUND_COUNTER; i++) {
            int number = Utils.getRandomNumber(MAX_RANDOM);
            gameQuestionAndAnswer[i][Engine.INDEX_QUESTION] = String.valueOf(number);
            gameQuestionAndAnswer[i][Engine.INDEX_ANSWER] = isEvenNumber(number) ? "yes" : "no";
        }
        Engine.runGame(GAME_RULES, gameQuestionAndAnswer);
    }

    private static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }

}
