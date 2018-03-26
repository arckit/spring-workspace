package com.robo.services;

import java.util.HashMap;
import java.util.Map;


import com.robot.common.Robot;

public class RobotTracker {
	

	//private static Map<String,Position[]> robotPositionSet = new HashMap<String,Position[]>();
	private static Map<String,Robot> robotSet = new HashMap<String,Robot>();

	

	
	public static void setName(String name,Robot robot){
		if(null != name){
			
			robotSet.put(name,robot);
		}
	}
	public static Robot getRobot(String name){
		Robot robo =null;
		if(null != name){
			robo =  robotSet.get(name);
		}
		return robo;
	}
	/*public static void setPosition(String name, Position pos){
		if(null != name){
			Position[] array = getMovements(name);
			if(null!= array)
			{
				array[array.length+1] = pos;
				
			}else {
				array[0] = pos;
			}
		robotPositionSet.put(name, array);
		}
	}*/
	
	public static boolean isAvailable(String name){
		if(null != name){
			if(!robotSet.isEmpty()){
				if(robotSet.containsKey(name))
					return true;
			}
		}
		return false;
	}
	/*public static Position[] getMovements(String name){
		if(null != name){
			if(!robotPositionSet.isEmpty()){
			 return robotPositionSet.get(name);	
			}
			}
			
		return null;
	}*/
	

}
