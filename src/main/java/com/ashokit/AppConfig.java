package com.ashokit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
public AppConfig() {
System.out.println("***AppConfig : Constructor****");
}
@Bean
public DateUtils getInstance()
{
	return new DateUtils();
}
}
