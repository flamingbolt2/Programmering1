package Game.R.P.S.New;

import java.util.Random;
import java.util.Scanner;

public class myRPS2 {

	public static void main(String[] args) {
		int computerChoice;
		
		Player player = new Player();
		Player playerCo = new Player();
		player.setName("Hussein");
		playerCo.setName("Co-Player");
		
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
				playerCo.setChoice("ROCK");
				break;
			case 2:
				playerCo.setChoice("PAPER");
				break;
			case 3:
				playerCo.setChoice("SCISSORS");
				break;
			default:
				System.out.println("Invalid Input");

			}
			System.out.println("Choose wisly my friend: ");
			player.setName(scan.next().toUpperCase());

			System.out.println("Computer play is: " + playerCo.getChoice());

			// _______________________________________________________
			
			switch (player.getChoice()) {
			case "ROCK":
				if (playerCo.getChoice() == "SCISSORS") {
					System.out.println("Rock crushes scissors. You win!!");
				} else if (playerCo.getChoice() == "PAPER") {
					System.out.println("Paper eats rock. You lose!!");
				} else if (playerCo.getChoice() == "ROCK") {
					System.out.println("ITS A TIE");
				}
				;
				break;
			case "PAPER":
				if (playerCo.getChoice().equals("ROCK")) {
					System.out.println("Paper eats rock. You win!!");
				} else if (playerCo.getChoice().equals("SCISSORS")) {
					System.out.println("Scissors cuts paper. You lose!!");
				} else if (playerCo.getChoice().equals("PAPER")) {
					System.out.println("ITS A TIE");
				}
				;
				break;
			case "SCISSORS":
				if (playerCo.getChoice().equals("PAPER")) {
					System.out.println("Scissors cuts paper. You win!!");
				} else if (playerCo.getChoice().equals("ROCK")) {
					System.out.println("Rock crushes scissors. You lose!!");
				} else if (playerCo.getChoice().equals("SCISSORS")) {
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
