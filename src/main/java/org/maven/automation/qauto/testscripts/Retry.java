package org.maven.automation.qauto.testscripts;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {

	public boolean retry(ITestResult result) {

		for (int i = 1; i < 5; i++) {
			System.out.println("The test case fails is " + result.getName());
		}

		return false;
	}

}
