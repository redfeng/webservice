package com.it.ws;


import javax.jws.WebService;
 
@WebService
public interface HelloWorld {
    String sayHi(String text);
}
