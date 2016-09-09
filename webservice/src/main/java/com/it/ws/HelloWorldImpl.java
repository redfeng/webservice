package com.it.ws;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;


@WebService(endpointInterface = "com.it.ws.HelloWorld")
public class HelloWorldImpl implements HelloWorld {
	 
    public String sayHi(String text) {
        System.out.println("sayHi called");
        return "Hello " + text;
    }
}
