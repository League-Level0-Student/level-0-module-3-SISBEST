//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100.
		int random = new Random().nextInt(100);

		// 2. Print out the random variable above

		// 11. Repeat steps 1 to 10 ten times
		for (int times = 0; times < 10; times++) {
			// 1. Ask the user for a guess using a pop-up window, and save their response
			String strguess = JOptionPane.showInputDialog("Guess a number!");
			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
			int guess = Integer.parseInt(strguess);
			if (guess == random) {
				JOptionPane.showMessageDialog(null, guess + " was correct! You win the game!");
				System.exit(0);
			}
			if (guess > random) {
				JOptionPane.showMessageDialog(null, guess + " is too high! Click OK to guess again!");
			}
			if (guess < random) {
				JOptionPane.showMessageDialog(null, guess + " is too low! Click OK to guess again!");
			}
		}

		// 13. Tell them they lose
		JOptionPane.showMessageDialog(null, "You lose!");
	}
}
