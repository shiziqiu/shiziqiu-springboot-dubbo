package com.shiziqiu.shop.web;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @title : Application
 * @author : shiziqiu
 * @date : 2017年9月28日 上午11:49:54
 * @Fun :
 */
@SpringBootApplication(scanBasePackages = "com.shiziqiu.shop.web.controller")
@ImportResource(locations = { "dubbo-consumer.xml" })
public class Application {

	private static Logger logger = Logger.getLogger(Application.class);

	/**
	 * Main Start
	 */
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		logger.info("===========success================");
		System.out.println("============= web启动成功 =============");
	}
}
