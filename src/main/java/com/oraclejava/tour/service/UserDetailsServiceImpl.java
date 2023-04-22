package com.oraclejava.tour.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.oraclejava.tour.model.Customer;
import com.oraclejava.tour.repository.CustomerRepository;

@Service
public class UserDetailsServiceImpl 
	implements UserDetailsService {

	@Autowired
	private CustomerRepository customerRepository;
	
	//loadUserByUsername
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		
		Customer customer = 
				customerRepository.findByCustomerMail(email)
					.orElseThrow(() -> 
							new UsernameNotFoundException("그런 이메일은 없는데요..."));
		
		UserDetails user = 
				new User(email, customer.getCustomerPass(), 
						AuthorityUtils.createAuthorityList(customer.getRole()));
		
		
		return user;
	}
}




