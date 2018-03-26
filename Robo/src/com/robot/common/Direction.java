package com.robot.common;
import java.util.Random;
 public enum Direction {
	    NORTH, EAST, SOUTH, WEST;
	     
	    
	    private static Random rnd = new Random();

	    static public Direction randomDirection() {
	        return Direction.values()[rnd.nextInt(4)];
	    }

	    // Rotate 90 degrees clockwise
	    public Direction turnRight() {
	        return values()[(ordinal() + 1) % 4];
	    }

	 /*   // Rotate 180 degrees
	    public Direction rotate180() {
	        return values()[(ordinal() + 2) % 4];
	    }*/

	    // Rotate 270 degrees clockwise (90 counterclockwise)
	    public Direction turnLeft() {
	        return values()[(ordinal() + 3) % 4];
	    } 
	
}
