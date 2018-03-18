package elseif;

import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
		String areYouHappy = JOptionPane.showInputDialog(null,"Are you happy?");
		if (areYouHappy.equals("Yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing what you're doing!");
		}
		if (areYouHappy.equals("No")) {
			String wantToBeHappy = JOptionPane.showInputDialog(null, "Do you want to be happy?");
			if (wantToBeHappy.equals ("No")) {
				JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing!");
			}
			if (wantToBeHappy.equals ("Yes")) {
				JOptionPane.showMessageDialog(null, "Change something.");
			}
				
		}
	}
}
