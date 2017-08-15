package com.xebia.robot.main.test;



import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.xebia.robot.service.IRobotService;
import com.xebia.robot.service.impl.RobotPrototype;

public class RobotApplicationJUnit {

	private IRobotService robotService;

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void roboTest() {
		robotService = new RobotPrototype();
		robotService.walk(3.5);
		robotService.carryAndWalk(1,13);
		Assert.assertFalse("Failed", robotService.walk(4));
		robotService.setCharging(60);
		Assert.assertTrue("Passed", robotService.walk(4));
	
	}

}
