package com.chensen.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeigthElem {
	// 高亮元素
		public static void HightLightElem(WebDriver driver,WebElement elem) {
			try {
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("arguments[0].setAttribute" + "('style',arguments[1]);", elem,
						"background:yellow;border:4px solid red;");
			} catch(Exception e) {
				// Log.error("元素点亮出现异常");
			}
		}
}
