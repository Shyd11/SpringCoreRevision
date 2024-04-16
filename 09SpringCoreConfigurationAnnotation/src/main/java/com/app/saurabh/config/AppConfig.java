package com.app.saurabh.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.saurabh.bean.PdfExport;
@Configuration
public class AppConfig {
	@Bean
	public  PdfExport pobj() {
		PdfExport p = new PdfExport();
		p.setFileName("SBMS");
		p.setFileAuth("saurabh");
		return p;
	}

}
