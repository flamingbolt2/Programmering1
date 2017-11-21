package yatzy;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Mane {

	public static void main(String[] args) {

		printBoard();

	}

	/**
	 * Print the game board!
	 */

	private static void printBoard() {

		JOptionPane.showMessageDialog(null, "message", "Board", 1);
		String name = JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showInputDialog("Hello", "Your name");
		ImageIcon icon = new ImageIcon("C:/Users/hussein.joodi/Desktop/dice.png");
		JOptionPane.showInputDialog(null, "Dice", "Dice", -1, icon, null, null);
		JOptionPane.showMessageDialog(null, "So your name is " + name);

	}

}
