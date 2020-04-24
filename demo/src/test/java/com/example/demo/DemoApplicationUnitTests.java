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

class DemoApplicationUnitTests {

	// Unit Tests: at the most basic, test code without a need for an
	// application Context setup - no need for SpringBoot/Context annotations here.
	@Test
	void messageTest(TestReporter testReporter) {
		Message classToTest = new MessagePropImpl();
		testReporter.publishEntry("Set message");
		classToTest.setMessage("TEST MESSAGE");
		assertEquals(classToTest.getMessage(),"TEST MESSAGE");
	}
	
	@Test
	void messageResourceTest(TestReporter testReporter) {
		Message classToTest = new MessagePropImpl();
		String m = classToTest.getMessage();
		testReporter.publishEntry("Get message: "+m);
		assertNotNull(m);
	}
	
	
}
