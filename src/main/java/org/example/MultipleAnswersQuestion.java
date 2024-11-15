package org.example;
import java.util.Scanner;


public class MultipleAnswersQuestion {
    public static int maxPoints = 0;

    public MultipleAnswersQuestion() {

    }

    public boolean checkInput(String input){
        if (input.length() > 4){
            return false;
        }
        if (input.matches("[abcd]+")){
            return true;
        } else {
            return false;
        }
    }


    public int printQuestion(){
        System.out.println("Please enter letters (2-4) with correct answers. For every correct choice is 1 point, so you can take more points in this round.");
        System.out.println("=========================");
        Scanner scanner = new Scanner(System.in);
        String answer = "";
        int points = 0;
        switch (SingleAnswerQuestion.randomWithRange()) {
            case 1 :
                MultipleAnswersQuestion.maxPoints = 2;
                System.out.println("Which creatures are bigger than house?");
                System.out.println("a. Succubus");
                System.out.println("b. Dragon");
                System.out.println("c. Centaurus");
                System.out.println("d. Giant");
                while (answer.isEmpty() || answer.length() > 4 || answer.contains("aa") || answer.contains("bb") || answer.contains("cc") || answer.contains("dd")) {
                    try {
                        answer = scanner.nextLine().toLowerCase();
                        if (answer.isEmpty() || answer.length() > 4 || answer.contains("aa") || answer.contains("bb") || answer.contains("cc") || answer.contains("dd"))  {
                            System.out.println("Not right option. Try again!");
                        }
                    } catch (Exception e) {
                        System.out.println("Wrong input. Try again!");
                    }
                }
                if(answer.equals("bd") || answer.equals("db")){
                    points += 2;
                } else if (answer.length() == 2 && ((answer.contains("b") && (answer.contains("a") || answer.contains("c"))) || (answer.contains("d") && (answer.contains("a") || answer.contains("c"))))) {
                    points++;
                } else if (answer.length() > 2) {
                    System.out.println("Too many choices. Not a single point for this question.");
                } else if (answer.length() < 2){
                    System.out.println("Not enough choices. Not a single point for this question. Do not be coward.");
                }
                break;
            case 2 :
                MultipleAnswersQuestion.maxPoints = 3;
                System.out.println("Which signs can Witcher (especially Geralt of Rivia) use?");
                System.out.println("a. Aard");
                System.out.println("b. Quen");
                System.out.println("c. Yrden");
                System.out.println("d. Srpen");
                while (answer.isEmpty() || !checkInput(answer) || answer.contains("aa") || answer.contains("bb") || answer.contains("cc")) {
                    try {
                        answer = scanner.nextLine().toLowerCase();
                        if (answer.isEmpty() || !checkInput(answer) || answer.contains("aa") || answer.contains("bb") || answer.contains("cc"))  {
                            System.out.println("Not right option. Try again!");
                        }
                    } catch (Exception e) {
                        System.out.println("Wrong input. Try again!");
                    }
                }

                if (answer.length() > 3){
                    System.out.println("Too many choices. Not a single point for this question.");
                } else if (answer.length() == 3 && !answer.contains("d")) {
                    points += 3;
                } else if (answer.length() == 3 && answer.contains("d")) {
                    points += 2;
                } else if (answer.length() == 2 && !answer.contains("d")) {
                    points += 2;
                } else if (answer.length() == 2 && answer.contains("d")) {
                    points += 1;
                } else if (answer.length() == 1) {
                    System.out.println("Not enough choices. Not a single point for this question. Do not be a coward.");
                }
                break;
            case 3 :
                MultipleAnswersQuestion.maxPoints = 4;
                System.out.println("What are elements of wizardry?");
                System.out.println("a. Fire magic");
                System.out.println("b. Frost magic");
                System.out.println("c. Alchemy");
                System.out.println("d. Enchanting");
                while (answer.isEmpty() || !checkInput(answer) || answer.contains("aa") || answer.contains("bb") || answer.contains("cc") || answer.contains("dd")) {
                    try {
                        answer = scanner.nextLine().toLowerCase();
                        if (answer.isEmpty() || !checkInput(answer) || answer.contains("aa") || answer.contains("bb") || answer.contains("cc") || answer.contains("dd"))  {
                            System.out.println("Not right option. Try again!");
                        }
                    } catch (Exception e) {
                        System.out.println("Wrong input. Try again!");
                    }
                }
                if (answer.length() == 4){
                    points += 4;
                } else if (answer.length() == 3) {
                    points += 3;
                } else if (answer.length() == 2) {
                    points += 2;
                } else if (answer.length() == 1) {
                    System.out.println("Not enough choices. Not a single point for this question. Do not be a coward.");
                }
                break;
        } return points;
    }
}
