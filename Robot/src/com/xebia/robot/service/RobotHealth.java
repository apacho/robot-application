package com.xebia.robot.service;

import com.xebia.robot.bean.Robot;

public abstract class RobotHealth {

	public abstract boolean canCarry(int weight);

	public abstract boolean batteryCheck(Robot robot, int charging);
}
