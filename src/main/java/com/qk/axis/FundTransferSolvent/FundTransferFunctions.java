package com.qk.axis.FundTransferSolvent;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qk.axis.readdata.BaseSolvent;
import com.qk.axis.readdata.GenericFuction;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;

public class FundTransferFunctions extends GenericFuction {
	public static AppiumDriver driver;
	public FundTransferFunctions() {
		
	}
	
	public FundTransferFunctions clickOnFundTransferButton(){
		new WebDriverWait(driver, 30)
		.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("img fundtransfer sel")))
		.isDisplayed();
		new WebDriverWait(driver, 5)
		.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("img fundtransfer sel")))
		.click();
		return this;
	}
	public FundTransferFunctions clickOnInitialButtonOfPayee(String Payee) throws InterruptedException{
		try {
			if(new WebDriverWait(driver, 20).until(
					
					ExpectedConditions.visibilityOfElementLocated(By.xpath("//XCUIElementTypeStaticText[@name='"
							+ Payee + "']/preceding-sibling:: XCUIElementTypeButton")))
					.isDisplayed()) {
				driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name='" + Payee
						+ "']/preceding-sibling::"
						+ " XCUIElementTypeButton")).click();
				
			}
			}catch(Exception e) {
				NotAvailableThenSwipeUp("//XCUIElementTypeStaticText[@name='"+ Payee +"']/preceding-sibling:: XCUIElementTypeButton");
			}
		return this;
	}
	

	

}
