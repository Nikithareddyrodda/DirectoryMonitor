package com.assignment.directorymonitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DirectorymonitorApplication {

	public static void main(String[] args) {
		SpringApplication.run(DirectorymonitorApplication.class, args);
	}

}
