package com.Actitime.Generic;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class LisenerImplimentation  extends BaseClass implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("Test started",true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Test success",true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		String time = LocalDateTime.now().toString().replace(":", "-");
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/actitime"+time+".png");
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("Test skipped",true);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}
	

}
