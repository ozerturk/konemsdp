package com.msdp.kone.m2m.json;

//{ "LiftMode" : 1, "ActualPosition" : 8, "NextLanding" : 8, "Direction" : 0} 

public class Elevator {
	
	private int LiftMode;
	private int ActualPosition;
	private int NextLanding;
	private int Direction;
	private int DoorState;
	
	public int getLiftMode() {
		return LiftMode;
	}
	public void setLiftMode(int liftMode) {
		LiftMode = liftMode;
	}
	public int getActualPosition() {
		return ActualPosition;
	}
	public void setActualPosition(int actualPosition) {
		ActualPosition = actualPosition;
	}
	public int getNextLanding() {
		return NextLanding;
	}
	public void setNextLanding(int nextLanding) {
		NextLanding = nextLanding;
	}
	public int getDirection() {
		return Direction;
	}
	public void setDirection(int direction) {
		Direction = direction;
	}
	@Override
	public String toString() {
		return "Elevator [LiftMode=" + LiftMode + ", ActualPosition=" + ActualPosition + ", NextLanding=" + NextLanding + ", Direction=" + Direction + "]";
	}
	public int getDoorState() {
		return DoorState;
	}
	public void setDoorState(int doorState) {
		DoorState = doorState;
	}
	
	
}
