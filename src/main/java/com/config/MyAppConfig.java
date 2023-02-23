package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "com.controller" })
public class MyAppConfig {
    
	@Bean
	public InternalResourceViewResolver getIRVR() {
		InternalResourceViewResolver IRVR = new InternalResourceViewResolver();
		IRVR.setPrefix("/views/");
		IRVR.setSuffix(".jsp");
		return IRVR;
	}

}
