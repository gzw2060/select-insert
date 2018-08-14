package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling	//用于开启定时任务
public class SelectInsertApplication {

	public static void main(String[] args) {
		SpringApplication.run(SelectInsertApplication.class, args);
	}
}
