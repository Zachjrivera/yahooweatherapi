package com.zach.yahooweatherapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class YahooweatherapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(YahooweatherapiApplication.class, args);
	}
}
