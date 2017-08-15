package com.xebia.robot.bean;

public class Robot {

	private int chargingStatus;
	private int weightCapacity;
	private int walkCapacity;
	private Color headLightColor;
	private final int MAX_WEIGHT_CAPACITY = 10;
	private int INITIAL_CAPACITY = 10;

	public Robot() {
		this.chargingStatus = 100;
		this.weightCapacity = MAX_WEIGHT_CAPACITY;
		this.headLightColor = Color.GREEN;
		this.walkCapacity = INITIAL_CAPACITY;
	}

	public int getChargingStatus() {
		return chargingStatus;
	}

	public void setChargingStatus(int chargingStatus) {
		this.chargingStatus = chargingStatus;
	}

	public int getWeightCapacity() {
		return weightCapacity;
	}

	public void setWeightCapacity(int weightCapacity) {
		this.weightCapacity = weightCapacity;
	}

	public int getWalkCapacity() {
		return walkCapacity;
	}

	public void setWalkCapacity(int walkCapacity) {
		this.walkCapacity = walkCapacity;
	}

	public Color getHeadLightColor() {
		return headLightColor;
	}

	public void setHeadLightColor(Color headLightColor) {
		this.headLightColor = headLightColor;
	}

}
