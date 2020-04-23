package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestReporter;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.web.servlet.MockMvc;

import com.example.demo.model.Message;
import com.example.demo.model.User;
import com.example.demo.model.impl.MessagePropImpl;

//@SpringBootTest
//@SpringBootTest(classes=)
//@ComponentScan
@SpringBootTest(classes=com.example.demo.DemoApplication.class)
@AutoConfigureMockMvc
class DemoApplicationIntegrationTests {



     // Now the integration test (load the application context)
	@Test
	void exampleTest(@Autowired MockMvc mvc) throws Exception {
	   mvc.perform(get("/")).
	   andExpect(status().isOk()).
	   andExpect(content().string((org.hamcrest.Matchers.containsString("Capitalism"))));
	  }
//	}
}
