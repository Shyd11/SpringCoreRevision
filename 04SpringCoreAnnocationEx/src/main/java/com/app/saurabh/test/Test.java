package com.app.saurabh.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.saurabh.ExcelExport;

public class Test {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		ac.scan("com.app.saurabh");
		ac.refresh();
		
		ExcelExport ee = ac.getBean("exObj", ExcelExport.class);
		System.out.println(ee);
	}

}
