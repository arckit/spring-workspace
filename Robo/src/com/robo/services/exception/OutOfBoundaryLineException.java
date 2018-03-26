package com.robo.services.exception;

import com.robot.constants.RobotConstants;

public class OutOfBoundaryLineException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

@Override
public String getMessage() {
	
	return RobotConstants.ERR_OUT_OF_BOUNDARY;
}

}
