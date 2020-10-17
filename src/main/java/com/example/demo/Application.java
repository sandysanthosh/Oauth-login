package com.example.demo;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableOAuth2Sso
public class Application {
	
	@RequestMapping
	public String getName(Principal name)
	{
		return "id" + name.getName() + "welcome Oauth";
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
