package com.chensen.utils;

import org.openqa.selenium.WebDriver;

/**
 * 获取cookies
 * @author wushu
 *
 */
public class CookieUtils {
	WebDriver driver;

	public void setCookies(){
		driver.manage().getCookies();
	}

}
