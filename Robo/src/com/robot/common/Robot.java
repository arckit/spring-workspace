package com.robot.common;
import javax.xml.bind.annotation.XmlRootElement;

import com.robo.services.exception.OutOfBoundaryLineException;

@XmlRootElement
public class Robot {

	String name;
	Position position;
	public Robot(String name, Position position) {
		super();
		this.name = name;
		this.position = position;
		if(position.getxAxis()>5)
			this.position.setxAxis(5);
		if(position.getyAxis()>5)
			this.position.setyAxis(5);
		if(position.getxAxis()<0)
			this.position.setxAxis(0);
		if(position.getyAxis()<0)
			this.position.setyAxis(0);
		
		
	}
	public Robot(String name) {
		super();
		this.name = name;
	}
	
	public void validatePosition(Position position) throws OutOfBoundaryLineException{
		
		if(position.getxAxis()>5 || position.getyAxis()>5 || position.getxAxis()<0 || position.getyAxis()<0 )
			throw new OutOfBoundaryLineException();
		

		
	}
	@Override
	public String toString() {
		return "Name ["+name+"] Position ["+position.toString()+"]";
	}
	
	
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setPosition(Position position) {
		
		this.position = position;
	}
	

	public Position getPosition(){
	return position;	
		
	}	
	

}
