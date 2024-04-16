package com.app.saurabh.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.saurabh.Bean.Product;
@Configuration
public class AppConfig {
	@Bean
	public Product prodobj(){
		Product p = new Product();
				p.setPid(56);
				p.setPname("pen");
				return p;
	}

}
