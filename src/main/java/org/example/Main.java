package org.example;

public class Main {
    public static void main(String[] args) {
        int points = 0;
        int maxPoints= 6;
        System.out.println("Greetings traveler, welcome to fantazy quiz!");
        System.out.println("=========================");
        SingleAnswerQuestion singleAnswerQuestion = new SingleAnswerQuestion();
        MultipleAnswersQuestion multipleAnswersQuestion = new MultipleAnswersQuestion();
        TypeAnswerQuestion typeAnswerQuestion = new TypeAnswerQuestion();

        points += singleAnswerQuestion.printQuestion();
        points += multipleAnswersQuestion.printQuestion();
        points += typeAnswerQuestion.printQuestion();

        maxPoints += MultipleAnswersQuestion.maxPoints;
        if (!TypeAnswerQuestion.instantWin) {
            System.out.println("You reach " + points + " points from " + maxPoints + " maximum points.");
        }
        System.out.println("Congratulations!");
    }
}