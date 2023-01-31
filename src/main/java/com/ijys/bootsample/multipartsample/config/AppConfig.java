package com.ijys.bootsample.multipartsample.config;

import com.ijys.bootsample.multipartsample.model.vo.PreferencesValues;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties({PreferencesValues.class})
public class AppConfig {
}
