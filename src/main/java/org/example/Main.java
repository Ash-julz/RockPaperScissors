package org.example;
import java.util.*;
import java.util.ArrayList;
public class Main {
    private static final ArrayList<String> gameChoices = new ArrayList<>(List.of("rock, paper, scissor"));
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        display();
        String userChoice = getUserInput(sc.nextInt());
        String CpuChoice = generateRandomCPUResponse();

    }
    public static void display(){
        System.out.println("Welcome to rockPaperScissors\n");
        System.out.println("Please choose a index: \n1) Rock \n2) Paper\n3) Scissors");
    }

    public static String getUserInput(int userInput) {
        if (userInput == 1){
            return "rock";
        }else if(userInput == 2){
            return "paper";
        }else if (userInput == 3){
            return "scissor";
        }else {
            return "Invalid input!";
        }

    }

    public static String generateRandomCPUResponse(){
        Random random = new Random();
        int index = random.nextInt(gameChoices.size());
        return gameChoices.get(index);
    }



}