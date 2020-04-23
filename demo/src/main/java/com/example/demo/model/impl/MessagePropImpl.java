package com.example.demo.model.impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.springframework.stereotype.Component;

import com.example.demo.model.Message;

@Component
public class MessagePropImpl implements Message {
	String resourceName = "/static/demo.properties";
//	String resourceName = null;
	String message=null;
	final static Properties prop = new Properties();

	@Override
	public String getMessage() {

		if (message != null) return message;
		InputStream s = this.getClass().getResourceAsStream(resourceName);
		try {
			prop.load(s);
			message = prop.getProperty("message");
		} catch (IOException e) {
			e.printStackTrace();
			message = "SOMETHING WENT WRONG";
		} finally {
			return message;
//			s.close();
		}
		
	}

	@Override
	public void setSource(String resource) {
		resourceName=resource;	
	}

	@Override
	public String getSource() {
		// TODO Auto-generated method stub
		return resourceName;
	}

	@Override
	public void setMessage(String message) {
		this.message = message;
		
	}

}
