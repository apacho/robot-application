package com.xebia.robot.main;

import com.xebia.robot.service.IRobotService;
import com.xebia.robot.service.impl.RobotPrototype;


public class RobotApplication {
	public static void main(String[] args){
		IRobotService obj = new RobotPrototype();
		obj.walk(3.5);
		obj.carry(5);
		obj.carryAndWalk(1,13);
		obj.setCharging(70);
		obj.carryAndWalk(3,2);
		obj.displayPrice(18);
	}
}
