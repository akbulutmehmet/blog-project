package com.akbulutmehmet.blogproject;

import com.akbulutmehmet.blogproject.model.Blog;
import com.akbulutmehmet.blogproject.repository.BlogRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BlogProjectApplication implements CommandLineRunner {


	@Override
	public void run(String... args) throws Exception {

	}

	public static void main(String[] args) {
		SpringApplication.run(BlogProjectApplication.class, args);
	}

}
