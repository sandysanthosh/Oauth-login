# Springboot-OAuth-Github


### Oauth in 3 steps:

### Pom.xml:

	<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-oauth2-client</artifactId>
		</dependency>


#### main.java:

```
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

```

### Application.yml:


```

security:
  oauth2:
    client:
       clientId: a48f56f893775afb1912
       clientSecret: c91036f105c04d0666655f411f716c43b606d373
       accessTokenUri: https://github.com/login/oauth/access_token
       userAuthorizationUri: https://github.com/login/oauth/authorize
       clientAuthenticationScheme: form
    resource:
      user-info-uri: https://api.github.com/user
      prefer-token-info: false 
      
```

### Test the links:

http://localhost:8080/
