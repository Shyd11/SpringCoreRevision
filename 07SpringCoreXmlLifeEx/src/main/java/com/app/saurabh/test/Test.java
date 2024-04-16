package com.app.saurabh.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.saurabh.bean.ExcelExport;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
		ExcelExport ee =ac.getBean("exObj",ExcelExport.class);
		System.out.println("From Main");
		System.out.println(ee);
		ac.close();
	
	}

}
