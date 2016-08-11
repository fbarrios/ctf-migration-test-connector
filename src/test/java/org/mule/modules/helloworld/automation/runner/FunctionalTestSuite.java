package org.mule.modules.helloworld.automation.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.mule.modules.helloworld.automation.functional.GreetTestCases;
import org.mule.modules.helloworld.HelloWorldConnector;
import org.mule.tools.devkit.ctf.mockup.ConnectorTestContext;

@RunWith(Suite.class)
@SuiteClasses({
	GreetTestCases.class
})

public class FunctionalTestSuite {
	
	@BeforeClass
	public static void initialiseSuite(){
		ConnectorTestContext.initialize(HelloWorldConnector.class);
	}
	
	@AfterClass
    public static void shutdownSuite() {
    	ConnectorTestContext.shutDown();
    }
	
}