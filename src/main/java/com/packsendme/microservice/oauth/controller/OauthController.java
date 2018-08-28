package com.packsendme.microservice.oauth.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.packsendme.microservice.oauth.repository.UserModel;

@RestController
@RequestMapping("/oauth/api/access")
public class OauthController {
	
	@RequestMapping("/user/oauth")
	public Principal getCurrentLoggedInUser(Principal user) {
		return user;
	}
	
	@RequestMapping("/user/account")
	public UserModel getUser(UserModel user) {
		return user;
	}
	
}
