package com.app.saurabh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(MyAppConfig.class);
		ExcelExport ee = ac.getBean("eobj", ExcelExport.class);
		System.out.println(ee);
	}

}
