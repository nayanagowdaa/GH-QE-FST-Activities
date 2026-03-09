package com.example;
 import java.util.Scanner;
import java.util.Random;

public class RPSGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        try {
            System.out.println("Rock Paper Scissors Game");
            System.out.println("1 = Rock");
            System.out.println("2 = Paper");
            System.out.println("3 = Scissors");

            System.out.print("Enter your choice: ");
            int player = sc.nextInt();

            

            if(player < 1 || player > 3) {
                throw new IllegalArgumentException("Invalid choice! Enter 1, 2, or 3.");
            }

            int computer = rand.nextInt(3) + 1;

            System.out.println("Computer choice: " + computer);

            if(player == computer) {
                System.out.println("Result: Draw");
            }
            else if((player == 1 && computer == 3) ||
                    (player == 2 && computer == 1) ||
                    (player == 3 && computer == 2)) {
                System.out.println("Result: Player Wins!");
            }
            else {
                System.out.println("Result: Computer Wins!");
            }

        } 
        catch(Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        finally {
            sc.close();
        }
    }
}   

