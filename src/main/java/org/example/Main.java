package org.example;

public class Main {
    public static void main(String[] args) {
        int points = 0;
        int MAX_POINTS = 6;
        System.out.println("Greetings traveler, welcome to fantazy quiz!");
        System.out.println("=========================");
        SingleAnswerQuestion singleAnswerQuestion = new SingleAnswerQuestion();
        MultipleAnswersQuestion multipleAnswersQuestion = new MultipleAnswersQuestion();
        TypeAnswerQuestion typeAnswerQuestion = new TypeAnswerQuestion();

        points += singleAnswerQuestion.printQuestion();
        points += multipleAnswersQuestion.printQuestion();
        points += typeAnswerQuestion.printQuestion();

        MAX_POINTS += MultipleAnswersQuestion.maxPoints;
        if (!TypeAnswerQuestion.instantWin) {
            System.out.println("You reach " + points + " points from " + MAX_POINTS + " maximum points.");
        }
        System.out.println("Congratulations!");
    }
}