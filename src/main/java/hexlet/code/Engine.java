package hexlet.code;

import java.util.Scanner;

public abstract class Engine {
    public static final int COUNT_VICTORY = 3;
    public static final int RANGE = 100;
    public static final String TEMPLATE = "'%s' is wrong answer ;(. Correct answer was '%s'.";
    private static String userName = "";
    private static int counter = 0;

    public static void constructHello() {
        System.out.println("Welcome to the Brain Games!");
        Scanner input = new Scanner(System.in);
        System.out.println("May I have your name?");
        userName = input.nextLine();
        System.out.println("Hello, " + userName + "!");
    }

    public static void askQuestion(String question) {
        System.out.println(question);
    }

    public static void checkVictory(String answerUser, String correctAnswer) {
        if (answerUser.equals(correctAnswer)) {
            System.out.println("Correct!");
            counter++;
        } else {
            System.out.println(String.format(Engine.TEMPLATE, answerUser, correctAnswer));
            System.out.println("Let's try again, " + Engine.userName + "!");
            System.exit(0);
        }
    }

    public static void askEnd() {
        System.out.println("Congratulations, " +  userName + "!");
    }

    public static int getCounter() {
        return counter;
    }

}
