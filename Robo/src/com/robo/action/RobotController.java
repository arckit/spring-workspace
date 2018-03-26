package com.robo.action;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.robo.services.RobotServiceImpl;
import com.robo.services.RobotServiceInterface;
import com.robo.services.exception.AlreadyAvaiableException;
import com.robo.services.exception.OutOfBoundaryLineException;
import com.robot.common.Direction;
import com.robot.common.Position;
import com.robot.constants.MovementConstant;
import com.robot.constants.RobotConstants;



@Path("/robot")
public class RobotController {
	RobotServiceInterface roboticService = new RobotServiceImpl();
	  // This method is called if TEXT_PLAIN is request
	  @GET
	  @Path("/{name}")
	 @Produces(MediaType.TEXT_PLAIN)
	  public String createRobot(@PathParam("name") String name) {
		
		  try {
			roboticService.createRobot(name);
		} catch (AlreadyAvaiableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return RobotConstants.ERR_ROBOT_ALREADY_AVAILABLE + "NAME:" +name;
		}
		  
	    return name + " Created Successfully!";
	  }
	  @GET
	  @Path("/{name}/d/{news}/{xaxis}/{yaxis}")
	 @Produces(MediaType.TEXT_PLAIN)
	  public String placeRobot(@PathParam("name") String name,@PathParam("news") String direction,@PathParam("xaxis") String x,@PathParam("yaxis") String y ) {
		  
		  try {
			  Position pos;
			  switch((direction).toUpperCase()){
			  
			  case  "NORTH" :
				   pos = new Position(new Integer(x), new Integer(y),Direction.NORTH )  ;
				break;  
			  case  "SOUTH" :
				   pos = new Position(new Integer(x), new Integer(y),Direction.SOUTH )  ;
					break;  
			  case  "EAST" :
				   pos = new Position(new Integer(x), new Integer(y),Direction.EAST )  ;
					break;  
			  case  "WEST" :
				   pos = new Position(new Integer(x), new Integer(y),Direction.WEST )  ;
					break;
				default :
					return "could not place robot as the direction param is not correct";
			  }
			return   (roboticService.placeRobot(name, pos)).toString();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "supplied x and y axis values are incorrect";
		} catch (OutOfBoundaryLineException e) {
			// TODO Auto-generated catch block
			return e.getMessage();
		}
		  
	   
	  }
	  
	  @GET
	  @Path("/{name}/position/{pos}")
	  public String moveRobot(@PathParam("name") String name, @PathParam("pos") String pos) {
		  try {
			  if(pos.equalsIgnoreCase("left"))
				  roboticService.moveRobot(name,MovementConstant.TURNLEFT);
			  else if(pos.equalsIgnoreCase("right"))
					roboticService.moveRobot(name,MovementConstant.TURNRIGHT);
			  else if(pos.equalsIgnoreCase("move"))
					roboticService.moveRobot(name,MovementConstant.STEPFORWARD);
			  else if(pos.isEmpty()){
				  return name + roboticService.getPosition(name);  
			  } // do nothing 
			  else  {
				  return "Invalid action, use left right move cmds";
				  }
			  return name + roboticService.getPosition(name);
				  
				 
		}  catch (OutOfBoundaryLineException e) {
			return e.getMessage();
		} catch (Exception e) {
			return "Could Not performAction";
		}

	  }
	  @GET
	  @Path("/{name}/position/")
	  public String getPosition(@PathParam("name") String name) {
		  try {
			  return name + roboticService.getPosition(name);  
		  } catch (Exception e) {
			return "Position unavailable";
		}

	  }
	
private String buildRes(Position pos){
	
	String str = "<table border='1' cellspacing='1' cellpadding='5'>";
pos.getxAxis();pos.getyAxis();
			for(int i = 0; i < 5; i++){
				if(i==pos.getxAxis()){str += "<tr color>";}	
			   str += "<tr>";
			   for (int j = 0; j < 5; j++){
			      str += "<td>" +  (i + j) + "</td>";
			   }
			   str += "<tr>";
			}

			str += "</table>";
	return null;
	
}
	  


}
