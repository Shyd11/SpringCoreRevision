package com.app.saurabh.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.saurabh.Bean.Product;
import com.app.saurabh.config.AppConfig;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		Product p = (Product)ac.getBean("prodobj");
		System.out.println(p);
	}

}
