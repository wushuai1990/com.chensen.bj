package com.chensen.base;

import java.util.Set;

import org.openqa.selenium.Alert;
/**
 * 获取、操作元素方法
 */
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.chensen.utils.AlertUtil;
import com.chensen.utils.HeigthElem;
import com.chensen.utils.log;

public class Functs {

	public WebDriver driver;
	public Actions action;
	public Select select;
	
	public Functs(WebDriver driver){
		this.driver = driver;
	}
	/*
	 * 获取元素方法
	 */
	public WebElement findElem(final String key) {
		WebDriverWait towait = new WebDriverWait(driver, 5);
		return towait.until(new ExpectedCondition<WebElement>() {
			@Override
			public WebElement apply(WebDriver input) {
				WebElement elem = input.findElement(ChoiceSelector.getElement(key));
				HeigthElem.HightLightElem(driver, elem);
				return elem;
			}
		});
	}

	/*
	 * 切换窗口
	 */
	public void switchWindow() {
		Set<String> windowHandles = driver.getWindowHandles();
		String windowHand = driver.getWindowHandle();
		for (String window : windowHandles) {
			if (windowHand.equals(window)) {
				driver.close();
			} else {
				driver.switchTo().window(windowHand);
			}
		}
	}

	/*
	 * 鼠标单次点击
	 */
	public void ClickOne(WebElement elem) {
		action.moveToElement(elem);
		action.click().perform();
	}

	/*
	 * 鼠标双击
	 */
	public void ClickDoub(WebElement elem) {
		action.doubleClick(elem);
		action.perform();
	}

	/*
	 * 拖拽元素
	 */
	public void ClickHold(WebElement elem1, WebElement elem2) {
		action.clickAndHold(elem1).moveToElement(elem2).perform();
		action.release();
	}

	/*
	 * 键盘操作Enter键
	 */
	public void PressEnter() {
		action.sendKeys(Keys.ENTER).perform();
	}

	/*
	 * 通过options下标获取下拉框中的元素
	 */

	public void getSlec(int index) {
		select.selectByIndex(index);
	}

	/*
	 * 通过options内容获取下拉框中的元素
	 */
	public void getSlec(String value) {
		select.selectByValue(value);
	}
	
	/*
	 * 通过options中text中的数据选择元素
	 */
	public void getSlecText(String value){
		select.deselectByVisibleText(value);
	}

	/*
	 * 处理弹出框,确定
	 */
	public void WinAlert(String at) {		
		Alert alert = AlertUtil.GetAlert(driver);
		try {
			if ("accept".equals(at)) {
				alert.accept();
			}else if ("dismiss".equals(at)) {
				alert.dismiss();
			}
		} catch (Exception e) {
			log.error("操作弹出框错误！");
		}
	}

}
