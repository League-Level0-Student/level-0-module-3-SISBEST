package extras;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot obedientRobot = new Robot();
		String Shape = JOptionPane.showInputDialog(null, "Square, Circle, or Triangle?");
		String Color = JOptionPane.showInputDialog(null, "What color?");
		if (Color.equals("Red"))
			obedientRobot.setPenColor(255,0,0);
		if (Color.equals("Green"))
			obedientRobot.setPenColor(0,255,0);
		if (Color.equals("Blue"))
			obedientRobot.setPenColor(0,0,255);


		if (Shape.equals("Square")) {
			drawSquare(obedientRobot);
		}
		else if (Shape.equals("Triangle")) {
			drawTriangle(obedientRobot);
		}
		else if (Shape.equals("Circle")) {
			drawCircle(obedientRobot);
		}

	}

	static void drawSquare(Robot obedientRobot) {
		obedientRobot.penDown();
		obedientRobot.setSpeed(999);
		for (int sq = 0; sq<4; sq++) {
		obedientRobot.move(100);
		obedientRobot.turn(90);
		}
		obedientRobot.hide();
		

	}

	static void drawTriangle(Robot obedientRobot) {
		obedientRobot.penDown();
		obedientRobot.setSpeed(999);	
		for (int tri = 0; tri<3;tri++) {
		obedientRobot.turn(120);
		obedientRobot.move(25);
		obedientRobot.hide();
		}
	}

	static void drawCircle(Robot obedientRobot) {
		obedientRobot.penDown();
		obedientRobot.setSpeed(999);
		for (int cir = 0; cir<360;cir++) {
			obedientRobot.move(1);
			obedientRobot.turn(1);
		}
			
		}
	}


