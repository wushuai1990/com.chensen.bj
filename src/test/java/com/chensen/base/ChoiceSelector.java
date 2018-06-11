package com.chensen.base;
/**
 * 读取配置文件，获取By类型元素
 * @author wushuai
 */
import org.openqa.selenium.By;

import com.chensen.utils.log;

public class ChoiceSelector {
	public static By getElement(String key){
		LoadPro pro = new LoadPro("conf/element.properties");
		String ValueInfo = pro.getProValue(key);
		String locatorType = ValueInfo.split("<")[0];
		String EleValue = ValueInfo.split("<")[1];
		if("id".equals(locatorType)){
			return By.id(EleValue);
		}else if("name".equals(locatorType)){
			return By.name(EleValue);
		}else if("xpath".equals(locatorType)){
			return By.xpath(EleValue);
		}else if("ClassName".equals(locatorType)){
			return By.className(EleValue);
		}else if("linkText".equals(locatorType)){
			return By.linkText(EleValue);
		}else if("tagName".equals(locatorType)){
			return By.tagName(EleValue);
		}else if("cssSelector".equals(locatorType)){
			return By.cssSelector(EleValue);
		}else if("partialLinkText".equals(locatorType)){
			return By.partialLinkText(EleValue);
		}else{
			log.error("无法获取定位器类型，检查配置文件！");
			return null;
		}
	}
}
