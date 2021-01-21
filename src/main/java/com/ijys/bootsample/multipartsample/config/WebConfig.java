package com.ijys.bootsample.multipartsample.config;

import nz.net.ultraq.thymeleaf.LayoutDialect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class WebConfig extends WebMvcConfigurationSupport {
	@Bean
	public LayoutDialect layoutDialect() {
		return new LayoutDialect();
	}
}
