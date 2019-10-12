package com.bridgelabz.annotation.qualifier;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.bridgelabz.annotation.qualifier")
@PropertySource("classpath:college_info.properties")
public class CollegeConfig {

}
