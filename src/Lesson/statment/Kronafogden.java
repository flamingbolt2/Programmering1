package Lesson.statment;

import java.util.Random;
import java.util.Scanner;

public class Kronafogden {
	public static void main(String[] args) {
		String usersPick;
		boolean coinFlippValue;

		Kronafogden kalle = new Kronafogden();
		Scanner usersGuess = new Scanner(System.in);

		System.out.println("Select Heads or Tails: ");
		usersPick = usersGuess.nextLine();

		Random randomGenerator = new Random();

		coinFlippValue = randomGenerator.nextBoolean();

		if (coinFlippValue == true) {
			System.out.println("Computer - Heads");
		} else {
			System.out.println("Computer - Tails");
		}

		if (coinFlippValue == true && usersPick.equalsIgnoreCase("Heads")) {

			String upperCase = "UPPERCASE";
			String lowerCase = "lowercase";

			System.out.println("You Won!" + " " + "your case was: " + lowerCase);
		} else if (coinFlippValue == false && usersPick.equalsIgnoreCase("Tails")) {

		} else {
			System.out.println("Better luck next time");

		}
	}

}