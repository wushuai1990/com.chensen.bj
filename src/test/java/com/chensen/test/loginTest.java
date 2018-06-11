package com.chensen.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.chensen.service.Login;
import com.chensen.utils.ScreenShot;
import com.chensen.utils.log;

public class loginTest {
	Login login = Login.getLogin();
	
	@Test
	public void Asslogin(){
		try{
			String message = login.start();
			Assert.assertEquals("供应商管理",message);
			log.info("登陆成功！");
		}catch(Exception e){
			log.error("------登陆失败！------");
			e.printStackTrace();
		}finally{
			ScreenShot.takeShot(login.getDriver(),"登陆");
		}
	}
	
	@AfterMethod
	public void close(){
		login.getDriver().quit();
	}
}
