package org.example;

import java.util.Scanner;

public class SingleAnswerQuestion {

    public static int randomWithRange(){
        int range = (3 - 1) + 1;
        return (int)(Math.random() * range) + 1;
    }

    public SingleAnswerQuestion() {

    }

    public int printQuestion(){
        System.out.println("Please enter one letter with correct answer.");
        System.out.println("=========================");
        Scanner scanner = new Scanner(System.in);
        String answer = "";
        int points = 0;
        switch (SingleAnswerQuestion.randomWithRange()) {
            case 1 :
                System.out.println("Finish the sentence: Hobits are *** *** dwarfs.");
                System.out.println("a. smaller than");
                System.out.println("b. taller than");
                System.out.println("c. same as");
                while (!answer.equals("a") && !answer.equals("b") && !answer.equals("c")) {
                    try {
                        answer = scanner.nextLine().toLowerCase();
                        if (!answer.equals("a") && !answer.equals("b") && !answer.equals("c")) {
                            System.out.println("Not one from options. Try again!");
                        }
                    } catch (Exception e) {
                        System.out.println("Wrong input. Try again!");
                    }
                }
                if(answer.equals("a")){
                   points++;
                }
                break;
            case 2 :
                System.out.println("Which race is most intelligent?");
                System.out.println("a. humans");
                System.out.println("b. elves");
                System.out.println("c. orcs");
                while (!answer.equals("a") && !answer.equals("b") && !answer.equals("c")) {
                    try {
                        answer = scanner.nextLine().toLowerCase();
                        if (!answer.equals("a") && !answer.equals("b") && !answer.equals("c")) {
                            System.out.println("Not one from options. Try again!");
                        }
                    } catch (Exception e) {
                        System.out.println("Wrong input. Try again!");
                    }
                }
                if(answer.equals("b")){
                    points++;
                }
                break;
            case 3 :
                System.out.println("Who is author of Witcher books?");
                System.out.println("a. J.R.R. Tolkien");
                System.out.println("b. G.R.R. Martin");
                System.out.println("c. Andrzej Sapkowski");
                while (!answer.equals("a") && !answer.equals("b") && !answer.equals("c")) {
                    try {
                        answer = scanner.nextLine().toLowerCase();
                        if (!answer.equals("a") && !answer.equals("b") && !answer.equals("c")) {
                            System.out.println("Not one from options. Try again!");
                        }
                    } catch (Exception e) {
                        System.out.println("Wrong input. Try again!");
                    }
                }
                if(answer.equals("c")){
                    points++;
                }
                break;

        } return points;
    }


}
