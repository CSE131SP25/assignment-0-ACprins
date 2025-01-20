package assignment0;

import support.assignment0.RobotMotionAdapter;

public class RobotInstructions  {

	/*
	 * Below you see a method called "act".
	 * It has one parameter, called "support.robot".
	 * For now, the way in which the code below fits into what you see on
	 * the screen will seem mysterious.  That's OK.
	 * 
	 * For now, please accept that the instructions below cause the support.robot to
	 * move forward, turn left, or turn right.
	 */
	public void act(RobotMotionAdapter robot) {
		
		/**
		 * Each of the following lines of code executes in turn.  The
		 * first line causes the support.robot to move forward 60 "pixels".  A pixel is
		 * a measurement of distance on a computer screen.
		 * 
		 * The second line causes the support.robot to turn left.  Based on what you see,
		 * what does "90" represent?
		 * 
		 * Run the program as instructed in the lab write-up and observe how the support.robot
		 * moves in response to the code you see below.
		 * 
		 * You will add instructions at the end of the code to cause the support.robot to move
		 * as you desire.
		 */
		robot.forward(400);
		robot.turnLeft(90);
		robot.forward(2);
		robot.turnLeft(89);
		robot.forward(400);
		robot.turnLeft(180);
		robot.forward(100);
		robot.turnLeft(180);
		robot.turnRight(89);
		robot.forward(160);
		robot.turnRight(176);
		robot.forward(320);
		robot.turnLeft(176);
		robot.forward(320);
		

		robot.turnRight(176);
		robot.forward(315);
		robot.turnLeft(176);
		robot.forward(310);
		

		robot.turnRight(176);
		robot.forward(310);
		robot.turnLeft(176);
		robot.forward(300);
		

		robot.turnRight(174);
		robot.forward(300);
		robot.turnLeft(174);
		robot.forward(260);
		

		robot.turnRight(173);
		robot.forward(260);
		robot.turnLeft(173);
		robot.forward(240);
		

		robot.turnRight(170);
		robot.forward(200);
		robot.turnLeft(170);
		robot.forward(200);
		

		robot.turnRight(168);
		robot.forward(180);
		robot.turnLeft(168);
		robot.forward(170);
		

		robot.turnRight(170);
		robot.forward(140);
		robot.turnLeft(168);
		robot.forward(100);
		
		robot.turnRight(170);
		robot.forward(100);
		robot.turnLeft(168);
		robot.forward(90);
		
		robot.turnRight(130);
		robot.forward(80);
		robot.turnRight(110);
		robot.forward(90);

		
		
	}

}
