package com.robo.services;

import com.robo.services.common.BaseRobotActions;
import com.robo.services.exception.OutOfBoundaryLineException;
import com.robot.common.Direction;
import com.robot.common.Position;
import com.robot.common.Robot;



/**
 * @author ARCHANA RAJASEKARAN
 * @Purpose This implementation of Robot Action would have actions supporting
 *           only a 2D place movement of a robot with only elementary movements
 *           like turnLeft and right for 90Degrees and moveforward. 
 *           {@Robot} should have basic attributes like @Position, @Direction to support the implementation 
 */
public final class RobotActionImpl extends BaseRobotActions {

	
	@Override
	public Position move(Robot robot) throws OutOfBoundaryLineException{
		Position newPosition = stepForward(robot.getPosition());
		if (isDangerZone(newPosition)) {
			System.out.println("DANGER moving to " + newPosition.toString());
			throw new OutOfBoundaryLineException();
		}
		return newPosition;
	}

	@Override
	public Position turnRight(Robot robot) {

		robot.setPosition(turnRight(robot.getPosition()));
		return robot.getPosition();
	}
	@Override
	public Position turnLeft(Robot robot) {

		robot.setPosition(turnLeft(robot.getPosition()));
		return robot.getPosition();
	}

	public void validateMovement(Robot robot,Position newPosition) {
		if (isDangerZone(newPosition)) {
			System.out.println("DANGER moving to " + newPosition.toString());
		} else {
			System.out.println("SUCCESSFULL moving to "
					+ newPosition.toString());
			robot.setPosition(newPosition);
		}
	}

	public boolean isDangerZone(Position newPosition) {
		// CORNER 00
		if ((newPosition.getxAxis() < 0 & newPosition.getyAxis() < 0)
				&& (newPosition.getFace() == Direction.WEST || newPosition.getFace() == Direction.SOUTH)) {
			return true;
		}
		// CORNER 55
		else if ((newPosition.getxAxis() > 5 & newPosition.getyAxis() > 5)
				&& (newPosition.getFace() == Direction.EAST || newPosition.getFace() == Direction.NORTH)) {
			return true;
		}
		// CORNER 05
		else if ((newPosition.getxAxis() >= 0 & newPosition.getyAxis() > 5)
				&& (newPosition.getFace() == Direction.WEST || newPosition.getFace() == Direction.NORTH)) {
			return true;
		}
		// CORNER 50
		else if ((newPosition.getxAxis() > 5 & newPosition.getyAxis() >= 0)
				&& (newPosition.getFace() == Direction.EAST || newPosition.getFace() == Direction.SOUTH)) {
			return true;
		}
		if (newPosition.getyAxis() < 0 && (newPosition.getFace() == Direction.SOUTH)) {
			return true;
		}
		if (newPosition.getxAxis() < 0 && (newPosition.getFace() == Direction.WEST)) {
			return true;
		}
		return false;
	}

	

	public static void main(String args[]) throws Exception {
		Robot robo = new Robot("MAGATRON",
				new Position(6,6, Direction.NORTH));
		RobotActionImpl ra = new RobotActionImpl();

		System.out.println("CURR POS of ROBOT:" + robo.getName() + " is ->"
				+ robo.getPosition().toString());
		ra.move(robo);
		System.out.println("CURR POS of ROBOT:" + robo.getName() + " is ->"
				+ robo.getPosition().toString());
		ra.turnLeft(robo);
		System.out.println("CURR POS of ROBOT:" + robo.getName() + " is ->"
				+ robo.getPosition().toString());
		ra.move(robo);
		System.out.println("CURR POS of ROBOT:" + robo.getName() + " is ->"
				+ robo.getPosition().toString());
		ra.turnRight(robo);
		System.out.println("CURR POS of ROBOT:" + robo.getName() + " is ->"
				+ robo.getPosition().toString());
		ra.move(robo);
		ra.move(robo);
		ra.move(robo);
		ra.move(robo);
		System.out.println("CURR POS of ROBOT:" + robo.getName() + " is ->"
				+ robo.getPosition().toString());

		ra.move(robo);
		ra.move(robo);
		ra.move(robo);
		ra.move(robo);
		ra.move(robo);
		System.out.println("CURR POS of ROBOT:" + robo.getName() + " is ->"
				+ robo.getPosition().toString());

	}
}
