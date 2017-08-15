package com.xebia.robot.service;

public interface IRobotService {

	boolean walk(double distance);

	boolean carry(int weight);

	boolean carryAndWalk(double distance, int weight);

	void setCharging(int percentage);

	void displayPrice(int barcode);
}
