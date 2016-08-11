package org.mule.modules.helloworld.automation.functional;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mule.modules.helloworld.HelloWorldConnector;
import org.mule.tools.devkit.ctf.junit.AbstractTestCase;

public class GreetTestCases extends
		AbstractTestCase<HelloWorldConnector> {

	public GreetTestCases() {
		super(HelloWorldConnector.class);
	}

	@Before
	public void setup() {
		// TODO
	}

	@After
	public void tearDown() {
		// TODO
	}

	@Test
	public void verify() {
		String friend = "Fede";
		assertEquals("Hello Fede. How are you?", getConnector().greet(friend));
	}

}