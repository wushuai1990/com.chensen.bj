package com.chensen.utils;

import com.chensen.base.LoadPro;

public class ProRead {
	public static String getValue(String key){
		LoadPro load = new LoadPro("conf/parameter.properties");
		return load.getProValue(key);
	}
}
