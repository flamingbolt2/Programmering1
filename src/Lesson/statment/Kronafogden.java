package Lesson.statment;

import java.util.Random;
import java.util.Scanner;

public class Kronafogden {

	public static void main(String[] args) {

		Scanner usersGuess = new Scanner(System.in);

		System.out.println("Select Heads or Tails: ");
		String usersPick = usersGuess.nextLine();

		Random randomGenerator = new Random();

		boolean coinFlippValue = randomGenerator.nextBoolean();

		if (coinFlippValue == true) {
			System.out.println("Computer - Heads");
		} else {
			System.out.println("Computer - Tails");
		}

		if (coinFlippValue == true && usersPick.equals("Heads")) {

			System.out.println("You Won!");
		} else if (coinFlippValue == false && usersPick.equals("Tails")) {

		} else {
			System.out.println("Better luck next time");

		}
	}

}