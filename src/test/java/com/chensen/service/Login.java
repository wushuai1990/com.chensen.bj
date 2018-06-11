package com.chensen.service;
/**
 * 登陆，单例
 */
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.chensen.base.Functs;
import com.chensen.base.InitDriver;
import com.chensen.utils.ProRead;

public class Login {
	private static Login login = null;
	InitDriver dr = new InitDriver(ProRead.getValue("brower"),ProRead.getValue("url"));
	Functs funct = new Functs(dr.driver);
	private Login(){
		
	}
	public static Login getLogin(){
		if(login==null){
			login = new Login();
		}
		return login;
	}
	
	public String start(){
		funct.findElem("login").click();
		WebElement username = funct.findElem("username");
		username.clear();
		username.sendKeys(ProRead.getValue("username"));
		/*
		 * 使用js进行密码的添加
		 */
		((JavascriptExecutor)dr.driver).executeScript(ProRead.getValue("password"));
		funct.findElem("loginbutton").click();
		((JavascriptExecutor)dr.driver).executeScript(ProRead.getValue("password"));	
		funct.findElem("loginbutton").click();
		String loginMessage = funct.findElem("loginmess").getText();
		return loginMessage;
	}
	
	public  WebDriver getDriver(){
		return dr.driver;
	}
}
