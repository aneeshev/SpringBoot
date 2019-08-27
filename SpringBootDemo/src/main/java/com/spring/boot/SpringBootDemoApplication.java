package com.spring.boot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDemoApplication  implements ApplicationRunner{

	private static final Logger logger = LoggerFactory.getLogger(SpringBootDemoApplication.class);

	public static void main(String[] args) {
		logger.info("this is a info message");
		logger.warn("this is a warn message");
		logger.error("this is a error message");
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}

	public static Logger getLogger() {
		return logger;
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("**********Hello World from Application Runner"+args.getOptionNames().size());
	}
	
	

}
