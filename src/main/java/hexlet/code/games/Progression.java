package hexlet.code.games;

import java.util.Arrays;
import hexlet.code.Engine;

public class Progression {
    private static final String GAME_RULES = "Please enter the game number and press Enter.";
    private static final int PROGRESSION_SIZE = 10;
    private static String[] range = new String[PROGRESSION_SIZE];
    private static int numberHiddenElement;

    public static void gameProgression() {
        String[] gameQuestion = new String[Engine.ROUND_COUNTER];
        String[] correctAnswer = new String[Engine.ROUND_COUNTER];
        for (int i = 0; i < Engine.ROUND_COUNTER; i++) {
            int firstElement = Engine.getRandomNumber(Engine.MAX_RANDOM);
            int stepProgression = Engine.getRandomNumber(Engine.MAX_RANDOM);
            range = getArithmeticalProgression(firstElement, stepProgression);
            correctAnswer[i] = getCorrectAnswer(range);
            range = getRangeWithHiddenElement(range, numberHiddenElement);
            gameQuestion[i] = String.join(" ", range);
        }
        Engine.runGame(GAME_RULES, gameQuestion, correctAnswer);
    }

    private static String getCorrectAnswer(String[] pRange) {
        numberHiddenElement = Engine.getRandomNumber(PROGRESSION_SIZE - 1);
        String correctAnswer = pRange[numberHiddenElement];
        return correctAnswer;
    }

    private static String[] getArithmeticalProgression(int firstElement, int stepProgression) {
        int[] rangeInt = new int[PROGRESSION_SIZE];
        rangeInt[0] = firstElement;
        for (int i = 1; i < rangeInt.length; i++) {
            rangeInt[i] = rangeInt[i - 1] + stepProgression;
        }
        range = Arrays.stream(rangeInt).mapToObj(String::valueOf).toArray(String[]::new);
        return range;
    }

    private static String[] getRangeWithHiddenElement(String[] pRange, int pNumberHiddenElement) {
        pRange[pNumberHiddenElement] = "..";
        return pRange;
    }

}
