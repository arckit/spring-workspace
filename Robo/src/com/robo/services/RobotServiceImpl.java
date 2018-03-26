package com.robo.services;

import com.robo.services.exception.*;
import com.robot.common.Direction;
import com.robot.common.Position;
import com.robot.common.Robot;
import com.robot.constants.MovementConstant;

public final class RobotServiceImpl implements RobotServiceInterface{

	
	
	public  Position placeRobot(String name, Position position) throws OutOfBoundaryLineException{
		Robot iRobot = new Robot(name, position);
		try{iRobot.validatePosition(position);}catch(OutOfBoundaryLineException e){throw e;}
		return iRobot.getPosition();
	}
	
	public void createRobot(String name) throws AlreadyAvaiableException{
		Robot iRobot = new Robot(name, new Position(0,0,Direction.NORTH)); //setting ROBOT with default position
		if( RobotTracker.isAvailable(name))
		   throw new AlreadyAvaiableException();
		else
			RobotTracker.setName(name,iRobot);
		//iRobot.getPosition();
		
	}

	
	public  Position moveRobot(String name,MovementConstant where) throws OutOfBoundaryLineException {
		Robot iRobot = RobotTracker.getRobot(name);
		if(null == iRobot)throw new OutOfBoundaryLineException();
		RobotActionImpl actionImpl = new RobotActionImpl();
		System.err.println(iRobot.getPosition().toString());
		if(where == MovementConstant.TURNRIGHT){
			
			iRobot.setPosition(actionImpl.turnRight(iRobot));
			System.err.println(iRobot.getPosition().toString());
		
		}
		else if (where == MovementConstant.TURNLEFT){
			iRobot.setPosition(actionImpl.turnLeft(iRobot));
			System.err.println(iRobot.getPosition().toString());
		}
			
		else if (where == MovementConstant.STEPFORWARD){
			try {
			
				iRobot.setPosition(actionImpl.move(iRobot));
			
			}
			catch(OutOfBoundaryLineException e){
				throw e;
			}
			
		}
		
		RobotTracker.setName(name, iRobot);
		System.out.println("MAP POS_______________________"+RobotTracker.getRobot(name).getPosition().toString());
		return RobotTracker.getRobot(name).getPosition();
	}

	
	public synchronized Position getPosition(String name) throws Exception {
		return RobotTracker.getRobot(name).getPosition();
		
	}
	
	public static void main(String args[]) throws Exception{
	
		RobotServiceImpl ra = new RobotServiceImpl();
		ra.createRobot("OPTIMUS");
        // ra.createRobot("OPTIMUS");
         ra.placeRobot("OPTIMUS", new Position(0,0,Direction.NORTH));
         String name = "OPTIMUS";
		System.out.println("CURR POS of ROBOT:" + name + " is ->"
				+ ra.getPosition(name));
		ra.moveRobot(name, MovementConstant.STEPFORWARD);
		System.out.println("CURR POS of ROBOT:" + name + " is ->"
				+ ra.getPosition(name));
		ra.moveRobot(name, MovementConstant.TURNLEFT);
		System.out.println("CURR POS of ROBOT:" + name + " is ->"
				+ ra.getPosition(name));
		ra.moveRobot(name, MovementConstant.STEPFORWARD);
		System.out.println("CURR POS of ROBOT:" + name + " is ->"
				+ ra.getPosition(name));
		ra.moveRobot(name, MovementConstant.TURNRIGHT);
		System.out.println("CURR POS of ROBOT:" + name + " is ->"
				+ ra.getPosition(name));
		ra.moveRobot(name, MovementConstant.STEPFORWARD);
		ra.moveRobot(name, MovementConstant.STEPFORWARD);
		ra.moveRobot(name, MovementConstant.STEPFORWARD);
		ra.moveRobot(name, MovementConstant.STEPFORWARD);
		ra.moveRobot(name, MovementConstant.STEPFORWARD);
		System.out.println("CURR POS of ROBOT:" + name + " is ->"
				+ ra.getPosition(name));

		ra.moveRobot(name, MovementConstant.STEPFORWARD);
		ra.moveRobot(name, MovementConstant.STEPFORWARD);
		ra.moveRobot(name, MovementConstant.STEPFORWARD);
		ra.moveRobot(name, MovementConstant.STEPFORWARD);
		ra.moveRobot(name, MovementConstant.STEPFORWARD);
		System.out.println("CURR POS of ROBOT:" + name + " is ->"
				+ ra.getPosition(name));
		

	}

}
