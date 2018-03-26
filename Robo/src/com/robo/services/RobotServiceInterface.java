/**
 * 
 */
package com.robo.services;

import com.robo.services.exception.AlreadyAvaiableException;
import com.robo.services.exception.OutOfBoundaryLineException;
import com.robot.common.Position;
import com.robot.constants.MovementConstant;

/**
 * @author ARCHANA RAJASEKARAN
 *
 */
public interface RobotServiceInterface {
	
	//public final RobotServiceInterface robotservice;
	void createRobot(String name)throws AlreadyAvaiableException;
    Position placeRobot(String name, Position position) throws OutOfBoundaryLineException;
	
	Position moveRobot(String name, MovementConstant direction) throws OutOfBoundaryLineException;
	
	Position getPosition(String name)throws Exception ;
	

}
