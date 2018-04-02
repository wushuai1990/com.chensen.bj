package AllWebElement;
/**
 * 选择浏览器，初始化地址
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChoiceBrower {
	
	WebDriver driver = null;
	public  WebDriver Init(String webdriver,String url){
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
		return driver;
	}
}
