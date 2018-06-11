package com.chensen.base;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class LoadPro {
	
	private String proPath;
	private Properties pro;
	
	/*
	 * 初始化配置文件
	 */
	public LoadPro(String proPath){
		this.proPath = proPath;
		this.pro = InitPro();
	}
	/*
	 * 读取properties配置文件
	 */
	private Properties InitPro(){
		 Properties properties = new Properties();
		 try {
			InputStream fis = new FileInputStream(proPath);
			BufferedInputStream bis = new BufferedInputStream(fis);
			properties.load(bis);

		} catch (Exception e) {
			
			e.printStackTrace();
		}
		 return properties;
	 }
	
	/*
	 * 通过key值获取value
	 */
	public String getProValue(String key){
		if(pro.containsKey(key)){
			return pro.getProperty(key);
		}else{
			return "读取文件失败";
		}
	}
}
