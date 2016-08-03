package org.mule.modules.ctfmigrationtest.automation.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.mule.modules.ctfmigrationtest.automation.functional.GreetTestCases;
import org.mule.modules.ctfmigrationtest.CTFMigrationTestConnector;
import org.mule.tools.devkit.ctf.mockup.ConnectorTestContext;

@RunWith(Suite.class)
@SuiteClasses({
	GreetTestCases.class
})

public class FunctionalTestSuite {
	
	@BeforeClass
	public static void initialiseSuite(){
		ConnectorTestContext.initialize(CTFMigrationTestConnector.class);
	}
	
	@AfterClass
    public static void shutdownSuite() {
    	ConnectorTestContext.shutDown();
    }
	
}