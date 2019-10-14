package com.bridgelabz.mavenproject.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class RunnerConfig {
	@Bean
	@Primary
	public Samsung getSamsung() {
		return new Samsung();
	}

	@Bean
	public Lenovo getLenovo() {
		return new Lenovo();
	}
}
