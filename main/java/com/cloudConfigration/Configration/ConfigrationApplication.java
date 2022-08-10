package com.cloudConfigration.Configration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigrationApplication.class, args);
	}

}
