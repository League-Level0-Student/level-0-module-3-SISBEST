package extras;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot obedientRobot = new Robot();
		String Shape = JOptionPane.showInputDialog(null, "Square, Circle, or Triangle?");
		if (Shape.equals("Square")) {
			drawSquare();
		}
		else if (Shape.equals("Triangle")) {
			drawSquare();
		}
		else if (Shape.equals("Circle")) {
			drawCircle();
		}

	}

	static void drawSquare(Robot obedientRobot) {
		obedientRobot.penDown();
		obedientRobot.setSpeed(999);
		obedientRobot.move(100);
		obedientRobot.turn(90);
		obedientRobot.move(100);
		obedientRobot.turn(90);
		obedientRobot.move(100);
		obedientRobot.turn(90);
		obedientRobot.move(100);

	}

	static void drawTriangle() {

	}

	static void drawCircle() {

	}

}
