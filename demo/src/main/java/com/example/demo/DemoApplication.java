package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;
import java.io.IOException;
import com.example.demo.model.Message;

@RestController
@EnableAutoConfiguration
@ComponentScan
public class DemoApplication {
	
	public Message message;

	
	public Message getMessage() {
		return message;
	}

	@Autowired
	public void setMessage(Message message) {
		this.message = message;
	}


	@RequestMapping("/")
	String home() throws IOException {
		return message.getMessage();
	}


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
