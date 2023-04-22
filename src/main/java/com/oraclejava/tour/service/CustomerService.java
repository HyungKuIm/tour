package com.oraclejava.tour.service;

import com.oraclejava.tour.model.Customer;

public interface CustomerService {
	//고객 검색
	Customer findOne(int customerCode);
	
	//회원 가입
	Customer register(Customer customer);
}
