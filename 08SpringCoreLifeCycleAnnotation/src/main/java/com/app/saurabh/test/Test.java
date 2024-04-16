package com.app.saurabh.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.app.saurabh.bean.ExcelExport;
import com.app.saurabh.config.AppConfig;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		ExcelExport ee = ac.getBean("exobj", ExcelExport.class);
		System.out.println("from main");
		System.out.println(ee);
		ac.close();
	}

}
