package com.example.demo;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootLog4jExampleApplication {
	/* Get actual class name to be printed on */
	static Logger log = Logger.getLogger(SpringBootLog4jExampleApplication.class.getName());

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLog4jExampleApplication.class, args);
		log.debug("Debug");
		log.info("Info");
		try {
			int a=23/0;

		} catch (Exception e) {
			log.error(e);
		}
	}

}
