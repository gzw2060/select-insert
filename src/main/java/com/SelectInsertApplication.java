package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@EnableScheduling	//用于开启定时任务
public class SelectInsertApplication {

	public static void main(String[] args) {
		SpringApplication.run(SelectInsertApplication.class, args);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("success", true);
		map.put("msg", "Git测试！");
	}
}
