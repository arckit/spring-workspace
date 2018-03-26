/**
 * 
 */
package com.robo.services.common;

import com.robo.services.exception.OutOfBoundaryLineException;
import com.robot.common.Position;
import com.robot.common.Robot;

/**
 * @author ARCHANA RAJASEKARAN
 *
 */
public interface RobotActionInterface {
	
	public Position turnRight(Robot robot);
	public Position turnLeft(Robot robot);
	public Position move(Robot robot) throws OutOfBoundaryLineException;
	public void validateMovement(Robot robot,Position newPosition);
	public boolean isDangerZone(Position newPosition);

}
