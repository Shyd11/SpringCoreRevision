package com.app.saurabh.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.saurabh.JdbcOpr;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
		JdbcOpr jdbc = ac.getBean("jdbcObj",JdbcOpr.class);
		System.out.println(jdbc);
	}

}
