package org.mule.modules.ctfmigrationtest.automation.functional;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mule.modules.ctfmigrationtest.CTFMigrationTestConnector;
import org.mule.tools.devkit.ctf.junit.AbstractTestCase;

public class GreetTestCases extends
		AbstractTestCase<CTFMigrationTestConnector> {

	public GreetTestCases() {
		super(CTFMigrationTestConnector.class);
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