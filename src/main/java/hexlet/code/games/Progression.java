package hexlet.code.games;

import java.util.Arrays;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    private static final String GAME_RULES = "Please enter the game number and press Enter.";
    private static final int MAX_RANDOM = 100;
    private static final int PROGRESSION_SIZE = 10;

    public static void gameProgression() {
        String[][] gameQuestionAndAnswer = new String[Engine.ROUND_COUNTER][Engine.SUBARRAY_LENGTH];
        for (int i = 0; i < Engine.ROUND_COUNTER; i++) {
            int firstElement = Utils.getRandomNumber(MAX_RANDOM);
            int stepProgression = Utils.getRandomNumber(MAX_RANDOM);
            int numberHiddenElement = Utils.getRandomNumber(PROGRESSION_SIZE - 1);
            String[] range = getArithmeticalProgression(firstElement, stepProgression);
            String correctAnswer = range[numberHiddenElement];
            gameQuestionAndAnswer[i][Engine.INDEX_ANSWER] = correctAnswer;
            range = getRangeWithHiddenElement(range, numberHiddenElement);
            gameQuestionAndAnswer[i][Engine.INDEX_QUESTION] = String.join(" ", range);
        }
        Engine.runGame(GAME_RULES, gameQuestionAndAnswer);
    }

    private static String[] getArithmeticalProgression(int firstElement, int stepProgression) {
        int[] rangeInt = new int[PROGRESSION_SIZE];
        String[] rangeString;
        rangeInt[0] = firstElement;
        for (int i = 1; i < rangeInt.length; i++) {
            rangeInt[i] = rangeInt[i - 1] + stepProgression;
        }
        rangeString = Arrays.stream(rangeInt).mapToObj(String::valueOf).toArray(String[]::new);
        return rangeString;
    }

    private static String[] getRangeWithHiddenElement(String[] pRange, int pNumberHiddenElement) {
        pRange[pNumberHiddenElement] = "..";
        return pRange;
    }

}
