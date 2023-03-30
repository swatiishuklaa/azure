package com.nagarro.em.springazureservice1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringAzureService1Application extends SpringBootServletInitializer {

	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder springApplicationBuilder){
        return springApplicationBuilder.sources(SpringAzureService1Application.class);
    }
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringAzureService1Application.class, args);
		System.out.println("Server is up on 8083 Port!!!");
	}

}
