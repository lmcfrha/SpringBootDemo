package com.example.demo.model;

import org.springframework.stereotype.Component;


public interface Message {
String getMessage();
void setMessage(String message);
String getSource();
void setSource(String source);
}
