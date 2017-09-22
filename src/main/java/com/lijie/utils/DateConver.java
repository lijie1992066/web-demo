package com.lijie.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.support.WebBindingInitializer;
import org.springframework.web.context.request.WebRequest;

public class DateConver implements WebBindingInitializer {
	
	public void initBinder(WebDataBinder binder, WebRequest request) {
		
		// 转换日期格式
		DateFormat dataFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		// 注册自定义的编辑器
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dataFormat, true));
		
	}
	
}
