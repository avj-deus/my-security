package com.cice.mysecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MySecurityApplication {

	public static void main(String[] args) {

		SpringApplication.run(MySecurityApplication.class, args);
	}

}
