package com.spring.xunconfig;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class XunconfigApplication {
	private static Logger logger = LoggerFactory.getLogger(XunconfigApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(XunconfigApplication.class, args);
		logger.info("xunconfig service is running ");
		logger.warn("测试输出文件-------");
	}
}
