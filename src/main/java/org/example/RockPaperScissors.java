package org.example;
import java.util.*;

public class RockPaperScissors {
    private static final List<String> gameChoices = Arrays.asList("rock", "paper", "scissor");

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        displayWelcomeMessage();
        while (true){
            displayOptions();

            String cpuChoice = generateRandomCPUResponse();
            String userChoice = getUserInput(sc.nextInt());

            if (userChoice.equalsIgnoreCase("Invalid input!")) {
                System.out.println(userChoice);
            } else {
                System.out.println("CPU choice: " + cpuChoice);
                determineWinner(userChoice, cpuChoice);
            }
        }

    }

    public static void displayWelcomeMessage(){
        System.out.println("Welcome to Rock, Paper, Scissors\n");
    }


    public static void displayOptions() {

        System.out.println("\nPlease choose an index: \n1) Rock \n2) Paper\n3) Scissors");
    }

    public static String getUserInput(int userInput) {
        switch (userInput) {
            case 1:
                return "rock";
            case 2:
                return "paper";
            case 3:
                return "scissor";
            default:
                return "Invalid input!";
        }
    }

    public static String generateRandomCPUResponse() {
        Random random = new Random();
        int index = random.nextInt(gameChoices.size());
        return gameChoices.get(index);
    }

    public static void determineWinner(String userChoice, String cpuChoice) {
        if (userChoice.equalsIgnoreCase(cpuChoice)) {
            System.out.println("It's a Draw!");
        } else if (userChoice.equalsIgnoreCase("rock")) {
            if (cpuChoice.equalsIgnoreCase("paper")) {
                System.out.println("You lose! Paper beats Rock");
            } else {
                System.out.println("You Win! Rock beats Scissor");
            }
        } else if (userChoice.equalsIgnoreCase("paper")) {
            if (cpuChoice.equalsIgnoreCase("scissor")) {
                System.out.println("You lose! Scissor beats Paper");
            } else {
                System.out.println("You Win! Paper beats Rock");
            }
        } else if (userChoice.equalsIgnoreCase("scissor")) {
            if (cpuChoice.equalsIgnoreCase("rock")) {
                System.out.println("You lose! Rock beats Scissor");
            } else {
                System.out.println("You Win! Scissor beats Paper");
            }
        }
    }
}
