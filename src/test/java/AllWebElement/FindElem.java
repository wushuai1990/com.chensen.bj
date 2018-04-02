package AllWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FindElem {

	private WebDriver driver;
	
	//选择浏览器类型
	public FindElem(String webdriver,String url){
		if(webdriver.equals("chrome")){
			System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}else if(webdriver.equals("firefox")){
			System.setProperty("webdriver.firefox.bin", "C:/Program Files/Mozilla Firefox/firefox.exe");
			driver = new FirefoxDriver();
		}else if(webdriver.equals("ie")){
			
		}else{
			System.out.println("浏览器驱动输入错误！");
		}
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public WebDriver getWebDriver(){
		return driver;
	}
	
	//关闭浏览器
	public void closeBrower(){
		driver.close();
		driver.quit();
	}

	// xpath定位
	public WebElement ByX(final String xpath) throws Exception {
		try {
			WebDriverWait towait = new WebDriverWait(driver, 5);
			return towait.until(new ExpectedCondition<WebElement>() {
				public WebElement apply(WebDriver driver) {
					WebElement XpathElem = driver.findElement(By.xpath(xpath));
					HigthLElem.HightLightElem(driver,XpathElem);
					return XpathElem;
				}
			});
		} catch (TimeoutException ex) {
			throw ex;
		} catch (Exception e) {
			throw e;
		}
	}

	// id定位
	public WebElement ByI(final String id) throws Exception {
		try {
			WebDriverWait towait = new WebDriverWait(driver, 5);
			return towait.until(new ExpectedCondition<WebElement>() {
				public WebElement apply(WebDriver driver) {
					WebElement IdElement = driver.findElement(By.id(id));
					HigthLElem.HightLightElem(driver,IdElement);
					return IdElement;
				}
			});
		} catch (TimeoutException ex) {
			throw ex;
		} catch (Exception e) {
			throw e;
		}
	}

	// name定位
	public WebElement ByN(final String name) throws Exception {
		try {
			WebDriverWait towait = new WebDriverWait(driver, 5);
			return towait.until(new ExpectedCondition<WebElement>() {
				public WebElement apply(WebDriver driver) {
					WebElement NameElem = driver.findElement(By.name(name));
					HigthLElem.HightLightElem(driver,NameElem);
					return NameElem;
				}

			});
		} catch (TimeoutException ex) {
			throw ex;
		} catch (Exception e) {
			throw e;
		}
	}

	// tagname定位
	public WebElement ByT(final String tagname) throws Exception {
		try {
			WebDriverWait towait = new WebDriverWait(driver, 5);
			return towait.until(new ExpectedCondition<WebElement>() {
				public WebElement apply(WebDriver driver) {
					WebElement tagNameElem = driver.findElement(By.tagName(tagname));
					HigthLElem.HightLightElem(driver,tagNameElem);
					return tagNameElem;
				}
			});
		} catch (TimeoutException ex) {
			throw ex;
		} catch (Exception e) {
			throw e;
		}
	}

	// linktext定位
	public WebElement ByL(final String linkText) throws Exception {
		try {
			WebDriverWait towait = new WebDriverWait(driver, 5);
			return towait.until(new ExpectedCondition<WebElement>() {
				public WebElement apply(WebDriver driver) {
					WebElement linktextElem = driver.findElement(By.linkText(linkText));
					HigthLElem.HightLightElem(driver,linktextElem);
					return linktextElem;
				}
			});
		} catch (TimeoutException ex) {
			throw ex;
		} catch (Exception e) {
			throw e;
		}

	}

	// CssSelector定位
	public WebElement ByCss(final String cssSelector) throws Exception {
		try {
			WebDriverWait towait = new WebDriverWait(driver, 5);
			return towait.until(new ExpectedCondition<WebElement>() {
				public WebElement apply(WebDriver driver) {
					WebElement cssElem = driver.findElement(By.cssSelector(cssSelector));
					HigthLElem.HightLightElem(driver,cssElem);
					return cssElem;
				}
			});
		} catch (TimeoutException ex) {
			throw ex;
		} catch (Exception e) {
			throw e;
		}
	}
	
	//classname定位
	public WebElement ByClass(final String className) throws Exception{
		try{
			WebDriverWait towait = new WebDriverWait(driver,5);
			return towait.until(new ExpectedCondition<WebElement>(){
				public WebElement apply(WebDriver driver){
					WebElement classElem = driver.findElement(By.className(className));
					HigthLElem.HightLightElem(driver,classElem);
					return classElem;
				}
			});
		}catch(TimeoutException ex){
			throw ex;
		}catch(Exception e){
			throw e;
		}
	}
}
