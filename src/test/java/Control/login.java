package Control;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import AllWebElement.FindElem;
import AllWebElement.log;


public class login {	
	FindElem findElem = null;
	WebDriver driver = null;
	@BeforeClass
	public void toInit(){
		findElem = new FindElem("chrome","http://nboh.choicesaas.cn/index.html#/");
		driver = findElem.getWebDriver();
	}
	
	@Test
	public void tologin() throws Exception{
		try{
			log.info("开始登陆");
			findElem.ByI("userName").sendKeys("15210732928");
			findElem.ByI("password").sendKeys("123456");
			Actions action = new Actions(driver);
			action.sendKeys(Keys.ENTER).perform();
			String str = findElem.ByX("//*[@id='container']/div/div/div[1]/div/span").getText().toString();
			Assert.assertEquals(str, "W小店");
			System.out.println("----str的值:------"+str);
		}catch(Exception e){
			log.error("登陆失败");
		}
	}
	
	@AfterClass
	public void toEnd() throws InterruptedException{
		Thread.sleep(3000);
		findElem.closeBrower();
//		driver.close();
//		driver.quit();
	}
}
