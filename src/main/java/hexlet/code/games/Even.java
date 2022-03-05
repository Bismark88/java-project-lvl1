package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    private static final String GAME_RULES = "Answer 'yes' if number even otherwise answer 'no'.";

    public static void gameEven() {
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
        String correctAnswer = "no";
        if (number % 2 == 0) {
            correctAnswer = "yes";
        }
        return correctAnswer;
    }

}
