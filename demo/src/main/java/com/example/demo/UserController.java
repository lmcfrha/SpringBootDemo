package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.model.UserRepository;

@RestController
@RequestMapping("api/")
public class UserController {

	  @Autowired
	  private UserRepository userRepository;

	  @RequestMapping(value = "user/{id}", method = RequestMethod.GET)
	  public String get(@PathVariable int id) {
	    return userRepository.findOne(new Integer(id)).getFirst();
	    
	  }
}
	

