package org.example;

import java.util.Scanner;

public class TypeAnswerQuestion {
    public static boolean instantWin = false;
    public TypeAnswerQuestion() {

    }

    public int printQuestion(){
        System.out.println("Please enter whole words for correct answer. For this round you can take 5 points.");
        System.out.println("=========================");
        Scanner scanner = new Scanner(System.in);
        String answer = "";
        int points = 0;
        switch (SingleAnswerQuestion.randomWithRange()) {
            case 1 :
                System.out.println("Please type full name of main character from Witcher series.");
                while (answer.isEmpty()) {
                    try {
                        answer = scanner.nextLine().toLowerCase();
                    } catch (Exception e) {
                        System.out.println("Wrong input. Try again!");
                    }
                }
                if (answer.equals("butcher of blaviken")){
                    points += 6;
                    TypeAnswerQuestion.instantWin = true;
                    System.out.println("You are true fan, traveler. With this answer you won the game!");
                } else if(answer.equals("geralt of rivia")){
                    points += 5;
                    System.out.println("Correct, full points for this answer.");
                } else if (answer.equals("geralt")) {
                    points += 3;
                    System.out.println("This is not full name, but some points you get.");
                } else {
                    System.out.println("Sorry, but i do not take your stuttering.");
                }
                break;
            case 2 :
                System.out.println("What was name of famous elf archer from Lord Of The Rings trilogy?");
                while (answer.isEmpty()) {
                    try {
                        answer = scanner.nextLine().toLowerCase();
                    } catch (Exception e) {
                        System.out.println("Wrong input. Try again!");
                    }
                }

                if(answer.equals("legolas")){
                    points += 5;
                    System.out.println("Correct, full points for this answer.");
                } else {
                    System.out.println("Sorry, but i do not take your stuttering.");
                }
                break;
            case 3 :
                System.out.println("Name of first novel from A Song of Ice and Fire?");
                while (answer.isEmpty()) {
                    try {
                        answer = scanner.nextLine().toLowerCase();
                    } catch (Exception e) {
                        System.out.println("Wrong input. Try again!");
                    }
                }
                if(answer.equals("a game of thrones") || answer.equals("game of thrones")){
                    points += 5;
                    System.out.println("Correct, full points for this answer.");
                } else {
                    System.out.println("Sorry, but i do not take your stuttering.");
                }
                break;
        } return points;
    }

}
