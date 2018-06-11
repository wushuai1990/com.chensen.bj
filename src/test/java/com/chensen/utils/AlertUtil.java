package com.chensen.utils;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertUtil {
	/*
	 * 处理弹出框
	 */
	public static Alert GetAlert(WebDriver driver){
		WebDriverWait towait  = new WebDriverWait(driver,5);
		return towait.until(new ExpectedCondition<Alert>() {
			@Override
			public Alert apply(WebDriver driver) {
				return driver.switchTo().alert();
			}		
		});
	}
}
