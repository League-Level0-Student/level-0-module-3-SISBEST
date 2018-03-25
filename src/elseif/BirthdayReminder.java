
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String grandpaBirthday = "Not sure";
		String gigiBirthday = "Try later";
		String myBirthday = "December 1";

		// 2. Find out which birthday the user wants and and store their response in a variable
		String RqBday = JOptionPane.showInputDialog(null, "What birthday do you want to view?");
		// 3. Print out what the user typed
		System.out.println("All right! Let's look up " + RqBday + "'s birthday!");
		if (RqBday.equals("Grandpa")) {
		JOptionPane.showMessageDialog(null, grandpaBirthday);
		}
		
		else if (RqBday.equals("Gigi")) {
		JOptionPane.showMessageDialog(null, gigiBirthday);
		}
		
		else if (RqBday.equals("Samuel")) {
		JOptionPane.showMessageDialog(null, myBirthday);
		}
		
		else {
			JOptionPane.showMessageDialog(null, "Sorry, I don't remember that person's birthday!");
		}
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
