package com.ijys.bootsample.multipartsample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class MultipartSampleApps extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(MultipartSampleApps.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(MultipartSampleApps.class, args);
	}
}
