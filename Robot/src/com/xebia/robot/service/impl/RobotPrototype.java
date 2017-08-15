package com.xebia.robot.service.impl;

import java.util.Random;

import com.xebia.robot.bean.Robot;
import com.xebia.robot.service.IRobotService;

public class RobotPrototype implements IRobotService {

	private Robot robot;
	private RobotHealthStat robotHealthStat;
	static int availbleCharging;

	public RobotPrototype() {
		this.robot = new Robot();
		this.robotHealthStat = new RobotHealthStat();

	}

	@Override
	public boolean walk(double km) {
		availbleCharging = robot.getChargingStatus();
		int requiredCharging = (int) (km * 1000 / 50);
		if (robotHealthStat.batteryCheck(robot, requiredCharging)) {
			System.out.println("Walked " + km + "km | Charging Used "
					+ requiredCharging + "% | Remaining  "
					+ robot.getChargingStatus() + "%");
			System.out.println("Robot HeadLight Color "
					+ robot.getHeadLightColor());
			System.out.println("************************************");
			return true;
		}
		return false;
	}

	@Override
	public boolean carry(int weight) {
		if (robotHealthStat.canCarry(weight)) {
			int requiredCharging = 2 * weight;
			availbleCharging = robot.getChargingStatus();
			if (robotHealthStat.batteryCheck(robot, requiredCharging)) {
				System.out.println("Carried " + weight + "kg | Charging Used "
						+ requiredCharging + "% | Remaining  "
						+ robot.getChargingStatus() + "%");
				System.out.println("Robot HeadLight Color "
						+ robot.getHeadLightColor());
				System.out.println("**************************");
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean carryAndWalk(double distance, int weight) {
		if (robotHealthStat.canCarry(weight)) {
			int requiredCharging = (int) (distance * 1000 / 50) + 2 * weight;
			availbleCharging = robot.getChargingStatus();
			if (robotHealthStat.batteryCheck(robot, requiredCharging)) {
				System.out.println("Walked " + distance + "km and Carried "
						+ weight + "kg | Charging Used " + requiredCharging
						+ "% | Remaining  " + robot.getChargingStatus() + "%");
				System.out.println("Robot HeadLight Color "
						+ robot.getHeadLightColor());
				System.out.println("**************************");
				return true;
			}
		}
		return false;
	}

	@Override
	public void setCharging(int percentage) {
		int currentCharging = robot.getChargingStatus();
		if (currentCharging + percentage > 100) {
			robot.setChargingStatus(100);
		} else {
			robot.setChargingStatus(currentCharging + percentage);
		}

	}

	@Override
	public void displayPrice(int barCode) {
		if (barCode % 2 == 0) {
			System.out.println("Price is " + new Random().nextInt(100));
		} else {
			System.out.println("Scan Failure");
		}

	}

}
