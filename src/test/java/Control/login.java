package Control;

import org.openqa.selenium.WebDriver;
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
		findElem = new FindElem("chrome","http://scm.devc7p.choicesaas.cn");
		driver = findElem.getWebDriver();
	}
	
	@Test
	public void tologin() throws Exception{
		try{
			log.info("开始登陆");
			findElem.ByI("userName").sendKeys("15210732928");
			findElem.ByI("password").sendKeys("123456");
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
