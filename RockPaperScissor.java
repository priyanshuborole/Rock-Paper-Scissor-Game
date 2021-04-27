package com.company;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Rock Paper Scissor game");
        System.out.println("Start = S\nExit = E");
        int flag = 1;
        //Here we are applying while loop to make game continuos
        while (flag != 0) {
            //Here we are deciding to Start or exit the game.
            String decide = sc.next();
            decide = decide.toUpperCase();
            if (decide.equals("S")) {
                flag = 2;
            } else if (decide.equals("E")) {
                flag = 0;
                break;
            }

            //computer making random choice
            Random number = new Random(); //using random class of java
            int num = number.nextInt(3) + 1;
            String computerChoice = "";
            if (num == 1) {
                computerChoice = "Rock";
            } else if (num == 2) {
                computerChoice = "Paper";
            } else if (num == 3) {
                computerChoice = "Scissor";
            }
            System.out.println("Computer made his choice,Now its your turn :)");

            //user making choice
            System.out.println("Follow this:Rock = R , Paper = P , Scissor = S");
            System.out.println("Enter your choice : ");
            String usernum = sc.next();
            usernum = usernum.toUpperCase();

            String userChoice = "";

            if (usernum.equals("R")) {
                userChoice = "Rock";
            } else if (usernum.equals("P")) {
                userChoice = "Paper";
            } else if (usernum.equals("S")) {
                userChoice = "Scissor";
            }
            // comparing computer and user choice
            if (computerChoice.equals(userChoice)) {
                System.out.println("Its tie! Try again.");
            }

            if (computerChoice.equals("Rock") && userChoice.equalsIgnoreCase("Paper")) {
                System.out.println("Winner = Computer\nOops!! You were unlucky try again");

            } else if (computerChoice.equals("Paper") && userChoice.equalsIgnoreCase("Scissor")) {
                System.out.println("Winner = Computer\nOops!! You were unlucky try again");
            } else if (computerChoice.equals("Scissor") && userChoice.equalsIgnoreCase("Rock")) {
                System.out.println("Winner = Computer\nOops!! You were unlucky try again");
            }

            if (computerChoice.equalsIgnoreCase("Paper") && userChoice.equals("Rock")) {
                System.out.println("Winner = You\nYeah boi!!Its your day today");
            } else if (computerChoice.equalsIgnoreCase("Scissor") && userChoice.equals("Paper")) {
                System.out.println("Winner = You\nYeah boi!!Its your day today");
            } else if (computerChoice.equalsIgnoreCase("Rock") && userChoice.equals("Scissor")) {
                System.out.println("Winner = You\nYeah boi!!Its your day today");
            }
            System.out.println("Next round = S\nExit = E");
        }
        System.out.println("Exited");
    }
}
