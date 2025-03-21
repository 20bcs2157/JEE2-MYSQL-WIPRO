package com.iiht.training.blogs;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
//@ComponentScan("com.iiht.blogs.controller")
public class SpringbootBlogAppicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBlogAppicationApplication.class, args);
	}
	
	 @Bean
	    public ModelMapper modelMapper() {
	        return new ModelMapper();
	    }
}
