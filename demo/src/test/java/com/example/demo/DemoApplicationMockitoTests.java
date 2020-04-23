package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.web.servlet.MockMvc;

import com.example.demo.model.Message;
import com.example.demo.model.User;
import com.example.demo.model.UserRepository;
import com.example.demo.model.impl.MessagePropImpl;


class DemoApplicationMockitoTests {

		@InjectMocks
	    private UserController userController;

	    @Mock
	    private UserRepository userRepository;

	    @BeforeEach
	    public void init() {
	        MockitoAnnotations.initMocks(this);
	    }

	
	// Now test a class that has injections: won't work unless you
	// take care of setting up injections => Mockito
	@Test
    public void testGetUserById() {
		 User u = new User("Alphonse","Daudet");
	     when(userRepository.findOne(new Integer(1))).thenReturn(u);
        String user = userController.get(1);
        assertEquals(user, "Alphonse");
    }
	
}
