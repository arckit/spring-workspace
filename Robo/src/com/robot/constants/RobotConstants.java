/**
 * 
 */
package com.robot.constants;

/**
 * @author ARCHANA RAJASEKARAN
 *
 */
public interface RobotConstants {
	public final  static String RIGHT_TURN = "RIGHT";
	public final  static String LEFT_TURN = "LEFT";
	public final  static String STEP_FORWARD = "STEP_FORWARD";
	
	public final  static Integer MAX_YAXIS = 5;
	public final  static Integer MAX_XAXIS = 5;
	public final  static Integer MIN_YAXIS = 0;
	public final  static Integer MIN_XAXIS = 0;
	public final  static boolean ENABLE_MOVEMENT_TRACKER = true;
	public final  static String ERR_ROBOT_ALREADY_AVAILABLE = "Sorry, Could not create Robot with this name as it already exists!";
	public final  static String ERR_OUT_OF_BOUNDARY = "Sorry, Could not place your Robot in specified position since its out of the boundary. Please ensure you place it with (0,0) and (5,5) range ";
	
	

}
