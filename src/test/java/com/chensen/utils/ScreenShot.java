package com.chensen.utils;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


/**
 * 截屏
 * @author wushuai
 *
 */
public class ScreenShot {

	public static void takeShot(WebDriver driver,String image){
		try {
			File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcfile, new File("D:/image/"+image));
		} catch (Exception e) {
			log.error("截图出现错误！");
			e.printStackTrace();
		}
	}
	
}
