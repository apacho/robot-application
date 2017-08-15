package com.xebia.robot.service.impl;

import com.xebia.robot.bean.Color;
import com.xebia.robot.bean.Robot;
import com.xebia.robot.service.RobotHealth;

public class RobotHealthStat extends RobotHealth {

	@Override
	public boolean canCarry(int weight) {
		if (weight > 10) {
			System.out.println("Overweight");
			System.out.println("****************************");
			return false;
		}
		return true;
	}

	@Override
	public boolean batteryCheck(Robot robot, int requiredCharging) {
		int availbleCharging = robot.getChargingStatus();
		if (availbleCharging < requiredCharging) {
			System.out.println("Sorry, Insufficient Charging");
			System.out.println("*********************************");
			return false;
		} else {
			int remaining = availbleCharging - requiredCharging;
			robot.setChargingStatus(remaining);
			if (remaining < 15) {
				robot.setHeadLightColor(Color.RED);
				System.out.println("************************");
			}
			return true;
		}
	}
}
