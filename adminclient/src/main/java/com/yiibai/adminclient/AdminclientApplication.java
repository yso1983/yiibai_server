package com.yiibai.adminclient;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class AdminclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminclientApplication.class, args);
	}

}

