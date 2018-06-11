package com.chensen.base;
/**
 * 初始化driver,提供driver
 * @author wushuai
 */


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import com.chensen.utils.log;

public class InitDriver{
	
	public WebDriver driver;
	public  InitDriver(String browser,String url){
		driver = DriverType(browser);
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	public WebDriver DriverType(String browser){
		if("chrome".equals(browser)){
			System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
			return new ChromeDriver();
		}else if("firefox".equals(browser)){
			//firefox最好安装在默认位置
			System.setProperty("webdriver.firefox.bin","C:/Program Files/Mozilla Firefox/firefox.exe");
			return new FirefoxDriver();
		}else if("ie".equals(browser)){
			System.setProperty("webdriver.ie.driver","driver/IEDriverServer.exe");
			return new InternetExplorerDriver();
		}else{
			log.error("选择浏览器错误，或者暂不支持该浏览器！");
			return null;
		}
	}
}
