package com.it.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.it.service.UserQueryService;

@Component
public class UserServiceImpl implements UserService{
	@Autowired
	private UserQueryService userQueryService;
	public void getUser() {
		System.out.println(userQueryService.getUser()); 
	}

}
