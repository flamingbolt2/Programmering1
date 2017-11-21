package Game.R.P.S.New;

import java.util.Random;
import java.util.Scanner;

public class RPS {

	public static void main(String[] args) {
		String playerOne = "";
		String playerTwo = "";
		int computerChoice;
		
		String response;

		Scanner scan = new Scanner(System.in);
		Random generator = new Random();

		System.out.println("Hey, let's play R,P,S!\n" + "Please choose.\n" + "Rock, Paper" + " and Scissors.\n"
				+ "May the odds be ever in your favor");

		System.out.println();
		while (true) {
			computerChoice = generator.nextInt(3) + 1;

			/*
			 * if (computerChoice == 1) playerTwo = "Rock"; else if (computerChoice == 2)
			 * This method is the first example playerTwo = "Paper"; else if (computerChoice
			 * == 3) playerTwo = "Scissors";
			 */

			switch (computerChoice) {
			case 1:
				playerTwo = "ROCK";
				break;
			case 2:
				playerTwo = "PAPER";
				break;
			case 3:
				playerTwo = "SCISSORS";
				break;
			default:
				System.out.println("Invalid Input");

			}
			System.out.println("Choose wisly my friend: ");
			playerOne = scan.next();

			playerOne = playerOne.toUpperCase();

			System.out.println("Computer play is: " + playerTwo);

			// _______________________________________________________
			String playerOnesChoice;
			switch (playerOne) {
			case "ROCK":
				if (playerTwo == "SCISSORS") {
					System.out.println("Rock crushes scissors. You win!!");
				} else if (playerTwo == "PAPER") {
					System.out.println("Paper eats rock. You lose!!");
				} else if (playerTwo == "ROCK") {
					System.out.println("ITS A TIE");
				}
				;
				break;
			case "PAPER":
				if (playerTwo == "ROCK") {
					System.out.println("Paper eats rock. You win!!");
				} else if (playerTwo == "SCISSORS") {
					System.out.println("Scissors cuts paper. You lose!!");
				} else if (playerTwo == "PAPER") {
					System.out.println("ITS A TIE");
				}
				;
				break;
			case "SCISSORS":
				if (playerTwo == "PAPER") {
					System.out.println("Scissors cuts paper. You win!!");
				} else if (playerTwo == "ROCK") {
					System.out.println("Rock crushes scissors. You lose!!");
				} else if (playerTwo == "SCISSORS") {
					System.out.println("ITS A TIE");
				}
				;
				break;
			default:
				;
			}
			/*
			 * if (playerOne.equalsIgnoreCase(playerTwo)) {
			 * System.out.println("It's a tie!"); } else if (playerOne.equals("ROCK") &&
			 * playerTwo.equals("SCISSORS")) {
			 * System.out.println("Rock crushes scissors. You win!!"); } else if
			 * (playerOne.equals("PAPER") && playerTwo.equals("SCISSORS")) {
			 * System.out.println("Scissor cuts paper. You lose!!"); } else if
			 * (playerOne.equals("ROCK") && playerTwo.equals("PAPER")) {
			 * System.out.println("Paper eats rock. You lose!!"); } else if
			 * (playerOne.equals("SCISSORS") && playerTwo.equals("PAPER")) {
			 * System.out.println("Scissor cuts paper. You win!!"); } else if
			 * (playerOne.equals("SCISSORS") && playerTwo.equals("ROCK")) {
			 * System.out.println("Rock crushes scissors. You lose!!"); } else if
			 * (playerOne.equals("PAPER") && playerTwo.equals("ROCK")) {
			 * System.out.println("Paper eats rock. You win!!"); }
			 */
		}
	}
}
