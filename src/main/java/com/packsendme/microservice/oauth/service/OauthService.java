package com.packsendme.microservice.oauth.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.packsendme.microservice.oauth.repository.UserModel;
import com.packsendme.microservice.oauth.repository.UserRepository;

@Service(value="oauthService")
public class OauthService  implements UserDetailsService
{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		//username = "ricardomarzochi";
		System.out.println(" D LOADUSERBYUSERNAME B "+ username);
		
		UserModel user = userRepository.findUserByUsername(username);

		if (user != null) {
			System.out.println(" TESTE userdetails C ");
			return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), getAuthority());
		}
		else {
			System.out.println(" TESTE userdetails D ");
			throw new UsernameNotFoundException("could not find the user '"
	                  + username + "'");
		}
	}
	
	private List getAuthority() {
		return Arrays.asList(new SimpleGrantedAuthority("ROLE_ADMIN"));
	}
	





}
