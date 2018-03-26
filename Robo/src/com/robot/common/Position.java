package com.robot.common;

public class Position {
    Direction face;
	Integer xAxis;
	public Direction getFace() {
		return face;
	}
	public void setFace(Direction face) {
		this.face = face;
	}
	public Integer getxAxis() {
		return xAxis;
	}
	public void setxAxis(Integer xAxis) {
		this.xAxis = xAxis;
	}
	public Integer getyAxis() {
		return yAxis;
	}
	public void setyAxis(Integer yAxis) {
		this.yAxis = yAxis;
	}
	Integer yAxis;
	
	public Position(){
		this.face= Direction.NORTH;
		this.xAxis =0;
		this.yAxis=0;
		
	}
	@Override
	public String toString() {
		return "Position [face=" + face + ", xAxis=" + xAxis + ", yAxis="
				+ yAxis + "]";
	}
	public Position(Integer xAxis,Integer yAxis,Direction face){
		this.face = face;
		this.xAxis = xAxis;
		this.yAxis = yAxis;
	}
}
