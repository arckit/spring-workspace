package com.robo.services.common;

import com.robo.services.exception.OutOfBoundaryLineException;
import com.robot.common.Direction;
import com.robot.common.Position;
import com.robot.common.Robot;





public abstract class BaseRobotActions implements RobotActionInterface{
	
	public static Position stepForward(Position currPosition){
		
		Position newPosition; //= new Position (currPosition.xAxis +1,currPosition.yAxis+1,currPosition.face);
		Integer xAxis=currPosition.getxAxis(),yAxis=currPosition.getyAxis();
		if (currPosition.getFace() == Direction.NORTH) {
			yAxis = yAxis + 1;
		} else if (currPosition.getFace() == Direction.SOUTH) {
			yAxis = yAxis - 1;
		} else if (currPosition.getFace() == Direction.EAST) {
			xAxis = xAxis + 1;
		} else if (currPosition.getFace() == Direction.WEST) {
			xAxis = xAxis -1 ;
		}
		newPosition = new Position (xAxis,yAxis,currPosition.getFace());
		//validateMovement(newPosition);
		return newPosition;
	}
	
	public abstract Position move(Robot robot) throws OutOfBoundaryLineException;
	
	public  Position turnRight(Position pos){
		return new Position(pos.getxAxis(), 
				pos.getyAxis(), pos.getFace()
				.turnRight());
	}
	public  Position  turnLeft(Position pos){
		return new Position(pos.getxAxis(), 
				pos.getyAxis(), pos.getFace()
				.turnLeft());
	}
	
	
	 
	   
}
