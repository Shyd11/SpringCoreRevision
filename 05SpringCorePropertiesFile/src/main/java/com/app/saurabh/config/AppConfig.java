package com.app.saurabh.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan("com.app.saurabh")
@PropertySource("classpath:myapp.properties")

public class AppConfig {
	

}
