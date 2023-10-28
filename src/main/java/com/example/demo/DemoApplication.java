package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.model.Student;
import com.example.demo.repo.StudentRepo;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
  public CommandLineRunner demo(StudentRepo repository) {
    return (args) -> {
      repository.save(new Student("1", "Shashank"));
      repository.save(new Student("2", "Sagar"));
      repository.save(new Student("3", "Ram"));
    };
  }

}
