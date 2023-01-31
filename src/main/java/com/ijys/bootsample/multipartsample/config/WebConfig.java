package com.ijys.bootsample.multipartsample.config;

import com.ijys.bootsample.multipartsample.model.vo.PreferencesValues;
import nz.net.ultraq.thymeleaf.LayoutDialect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class WebConfig extends WebMvcConfigurationSupport {
	final PreferencesValues preferencesValues;

	public WebConfig(PreferencesValues preferencesValues) {
		this.preferencesValues = preferencesValues;
	}

	@Bean
	public LayoutDialect layoutDialect() {
		return new LayoutDialect();
	}
}
