package com.robo.services.exception;

import com.robot.constants.RobotConstants;

public class AlreadyAvaiableException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

@Override
public String getMessage() {
	
	return super.getMessage()+RobotConstants.ERR_ROBOT_ALREADY_AVAILABLE;
}
}
